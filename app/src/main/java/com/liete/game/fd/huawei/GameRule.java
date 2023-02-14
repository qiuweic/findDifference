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
    private final float scaleX;
    private final float scaleY;
    private final Paint paint;

    private final int pHeight;

    boolean isClicked = false;

    public GameRule(int[] info, float scaleX, float scaleY, int pHeight) {
        this.info = info;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.pHeight = pHeight;

        paint = new Paint();
        paint.setColor(0xff03dac5);
        paint.setStrokeWidth(scaleX * 10); // 圆圈边框大小
        paint.setStyle(Paint.Style.STROKE);
    }

    public void drawCoordinate(Canvas canvas) {
        canvas.save();
        canvas.scale(scaleX, scaleY, info[0] , info[2]);
        canvas.restore();
        if (isClicked) {
            for (int i = 0; i < 2; i++) {
                canvas.drawRoundRect(new RectF(info[0] * scaleX , pHeight / 2 * i + info[1] * scaleY + i * 10, info[2] * scaleX, pHeight / 2 * i + info[3] * scaleY + i * 10),25, 25, paint);
            }
        }
    }


    public boolean isClick(float xx, float yy) {
        Log.i("CCC", "xx = " + xx + ", yy = " + yy);
        Log.i("CCC", "xx2 = " + xx / scaleX + ", yy2 = " + yy / scaleY);
        for (int i = 0; i < 2; i++) {
            if (xx > info[0] * scaleX && xx < info[2] * scaleX && yy > pHeight / 2 * i + info[1] * scaleY + i * 10 && yy < pHeight / 2  * i + info[3] * scaleY) {
                //Log.i("CCC", "info0 = " + info[0] + ", info1 = " + info[1] + ", info2 = " + info[2] + ", info3 = " + info[3]);
                //Log.i("CCC", "infoX0 = " + info[0] * scaleX + ", infoY1 = " + info[1] * scaleY +  ", infoX2 = " + info[2] * scaleX + ", infoY3 = " + info[3] * scaleY) ;
                return true;
            }
        }
        return false;
    }


}
