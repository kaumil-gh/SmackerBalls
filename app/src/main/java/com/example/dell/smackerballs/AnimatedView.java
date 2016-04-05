package com.example.dell.smackerballs;

/**
 * Created by Dell on 05-04-2016.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;


public class AnimatedView extends ImageView {
    private Context context;
    int x = -1;
    int y = -1;
    private int VelocityxDirection = 10;
    private int VelocityyDirection = 5;
    private Handler handler;
    private final int FRAME_RATE = 30;


    public AnimatedView(Context context, AttributeSet attrs)  {
        super(context, attrs);
        context = context;
        handler = new Handler();
    }

    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate();
        }
    };

    protected void onDraw(Canvas canvas) {

        BitmapDrawable drawableball = (BitmapDrawable) context.getResources().getDrawable(R.drawable.ball);
        if (x<0 && y <0) {
            x = this.getWidth()/2;
            y = this.getHeight()/2;
        } else {
            x += VelocityxDirection;
            y += VelocityyDirection;
            if ((x > this.getWidth() - drawableball.getBitmap().getWidth()) || (x < 0)) {
                VelocityxDirection = VelocityxDirection*-1;
            }
            if ((y > this.getHeight() - drawableball.getBitmap().getHeight()) || (y < 0)) {
                VelocityyDirection = VelocityxDirection*-1;
            }
        }
        canvas.drawBitmap(drawableball.getBitmap(), x, y, null);
        handler.postDelayed(r, FRAME_RATE);
    }
}
