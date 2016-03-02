package com.example.dell.smackerballs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;
import static com.example.dell.smackerballs.R.id.SliderImage;

public class SinglePlayerScreen extends AppCompatActivity implements OnTouchListener {

    ViewGroup _root;
    ImageView slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);

        slider  = (ImageView)findViewById(R.id.SliderImage);

        slider.setOnTouchListener(this);

    }

    public boolean onTouch(View view, MotionEvent event) {
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        int _xDelta = 0 ;
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_MOVE:
                //        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                //         layoutParams.leftMargin = X - _xDelta-75;

                slider.setX(X - _xDelta - 65);
                //        view.setLayoutParams(layoutParams);
                break;
        }
        _root.invalidate();
        return true;
    }
}


