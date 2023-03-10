package com.liete.game.fd.huawei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;


/**
 * 游戏逻辑
 *
 */
public class GameRule {
    private final int[] info;
    private final Paint paint;
    private final float scaleX;
    private final int pHeight;
    private final int pWidth;


    boolean isClicked = false;

    public GameRule(int[] info, float scaleX, int pWidth, int pHeight) {
        this.info = info;
        this.scaleX = scaleX;
        this.pHeight = pHeight;
        this.pWidth = pWidth;

        paint = new Paint();
        paint.setColor(0xff03dac5);
        paint.setStrokeWidth(scaleX * 15); // 圆圈边框大小
        paint.setStyle(Paint.Style.STROKE);
    }

    public void drawCoordinate(Canvas canvas) {
        canvas.save();
        float scaleW = (float) pWidth / 700;
        float scaleH = (float) pHeight / 525;
        canvas.restore();
        //if (isClicked) {
            for (int i = 0; i < 2; i++) {
                canvas.drawRoundRect(new RectF(info[0] * scaleW , pHeight * i + info[1] * scaleH + i * 10, info[2] * scaleW, pHeight * i + info[3] * scaleH + i * 10),25, 25, paint);
            }
        //}
    }


    public boolean isClick(float xx, float yy) {
        float scaleW = (float) pWidth / 700;
        float scaleH = (float) pHeight / 525;
        //Log.i("CCC", "xx = " + xx + ", yy = " + yy);
        Log.i("CCC", "xx2 = " + (xx / scaleW) + ", yy2 = " + (yy / scaleH));
        for (int i = 0; i < 2; i++) {
            if (xx > (info[0] * scaleW) && xx < (info[2] * scaleW) && yy > (pHeight * i + info[1] * scaleH + i * 10) && yy < (pHeight  * i + info[3] * scaleH)) {
                return true;
            }
        }
        return false;
    }


}
