package com.liete.game.fd.huawei;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;

import java.util.Vector;

public class GameView extends View {

    private final Vector<GameRule> diffVector;
    private Pair<Float, Float> errorIndex;
    private boolean gameOver = false;
    private boolean isPaused;
    private boolean errorTouch;
    private final int pWidth;
    private final int pHeight;

    private int diffCount;
    private int foundCount;

    private Bitmap bmpTop;
    private Bitmap bmpBottom;
    private Bitmap bmpError;


    private final TouchListener touchListener;

    public interface TouchListener {
        void onErrorTouch();
        void onAccurateTouch();
        void onFoundAll();
    }

    public void setGameOver(boolean isOver) {
        this.gameOver = isOver;
    }

    public void setGameState(boolean isPaused) {
        this.isPaused = isPaused;
    }

    public GameView(Context context, int pWidth, int pHeight, int levelId, TouchListener touchListener) {
        super(context);
        this.pWidth = pWidth;
        this.pHeight = pHeight;
        this.touchListener = touchListener;

        diffVector = new Vector<>();

        bmpError = BitmapFactory.decodeResource(getResources(), R.drawable.ic_error_100);
        loadGameLevel(levelId);
    }

    public void loadGameLevel(int levelId) {
        Pair<Integer, Integer> infoPair = GameInfo.getGameLevelInfo(levelId);
        bmpTop = BitmapFactory.decodeResource(getResources(), infoPair.first);
        bmpBottom = BitmapFactory.decodeResource(getResources(), infoPair.second);


        int[][] coordinates = GameInfo.getGameCoordinate(levelId);
        diffCount = coordinates.length;
        foundCount = 0;

        int w = pWidth;
        int h = pHeight / 2;
        float scaleX = (float) w / bmpTop.getWidth();
        float scaleY = (float) h / bmpTop.getHeight();
        Log.i("CCC", "scaleX = " + scaleX + ", scaleY = " + scaleY);

        diffVector.clear();
        for (int[] coordinate : coordinates) {
            diffVector.addElement(new GameRule(coordinate, scaleX, scaleY, pHeight));
        }
        invalidate();
    }

    public void drawOneDiff() {
        for (int i = 0; i < diffVector.size(); i++) {
            GameRule area = diffVector.elementAt(i);
            if (!area.isClicked) {
                area.isClicked = true;
                foundCount++;
                invalidate();

                touchListener.onAccurateTouch();
                if (foundCount >= diffCount) {
                    Log.e("CCC", "You had found all difference.");
                    touchListener.onFoundAll();
                }
                break;
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        @SuppressLint("DrawAllocation")
        Paint paint = new Paint();
        paint.setColor(0xffff0000);
        drawPicture(canvas);
        for (int i = 0; i < diffVector.size(); i++) {
            diffVector.elementAt(i).drawCoordinate(canvas);
        }

        if (errorTouch) {
            drawError(canvas, errorIndex.first, errorIndex.second);
        }
    }

    @Override
    @SuppressLint("ClickableViewAccessibility")
    public boolean onTouchEvent(MotionEvent event) {
        //if (gameOver) return true;
        //if (isPaused) return true;

        if (event.getAction() == 0) {
            float xx = event.getX();
            float yy = event.getY();
            errorTouch = true;
            for (int i = 0; i < diffVector.size(); i++) {
                GameRule area = diffVector.elementAt(i);
                if (area.isClick(xx, yy) && !area.isClicked) {
                    area.isClicked = true;
                    errorTouch = false;
                    foundCount++;
                    invalidate();

                    touchListener.onAccurateTouch();
                    if (foundCount >= diffCount) {
                        Log.e("CCC", "You had found all difference.");
                        touchListener.onFoundAll();
                    }
                    break;
                }
            }

            if (errorTouch) {
                errorIndex = new Pair<>(xx, yy);
                invalidate();
            }
        }
        return true;
    }

    public void drawError(Canvas canvas, float xx, float yy) {
        float scaleX = (float) pWidth / bmpTop.getWidth();

        Paint p = new Paint();
        p.setStrokeWidth(scaleX * 10);
        p.setAntiAlias(true);
        p.setColor(0xffed7899);
        p.setStyle(Paint.Style.STROKE);
        RectF rectF = new RectF(xx - 50, yy - 50, xx + 50, yy + 50);
        canvas.drawOval(rectF, p);

        canvas.drawLine(xx - 25, yy - 25, xx + 25, yy + 25, p);
        canvas.drawLine(xx + 25, yy - 25, xx - 25, yy + 25, p);

        touchListener.onErrorTouch();
        errorTouch = false;
        postInvalidateDelayed(200);
    }


    public void drawPicture(Canvas canvas) {
        int width = pWidth;
        int height = pHeight / 2;
        float scaleX = (float) width / bmpTop.getWidth();
        float scaleY = (float) height / bmpTop.getHeight();
        Paint paint = new Paint();
        paint.setColor(0xffff0000);

        for (int i = 0; i < 2; i++) {
            canvas.save();
            canvas.scale(scaleX, scaleY, 2, height * i + i * 10);
            if (i == 0) { //画出top图
                canvas.drawBitmap(getRoundedCornerBitmap(bmpTop), 2, 0, paint);
            } else { //画出bottom图
                canvas.drawBitmap(getRoundedCornerBitmap(bmpBottom), 2, height * i + 10, paint);
            }
            canvas.restore();
        }
    }

    /**
     * 设置圆角
     */
    public Bitmap getRoundedCornerBitmap(Bitmap bitmap) {
        try {
            Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(output);
            final Paint paint = new Paint();
            final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            final RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
            final float roundPx = 40;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(Color.BLACK);
            canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

            final Rect src = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            canvas.drawBitmap(bitmap, src, rect, paint);
            return output;
        } catch (Exception e) {
            return bitmap;
        }
    }
}
