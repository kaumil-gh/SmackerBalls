package com.example.dell.smackerballs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.app.Activity;

public class SinglePLayerScreen extends AppCompatActivity implements OnTouchListener {


   // ViewGroup _root;   what is the use of this?
    ImageView slider;
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_screen_player);
        slider = (ImageView)findViewById(R.id.SliderImage);
        slider.setOnTouchListener(this);
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_screen_player);
        slider = (ImageView)findViewById(R.id.SliderImage);
        slider.setOnTouchListener(this);

        // for hide the status bar
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public boolean onTouch(View view, MotionEvent event) {
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        int _xDelta = 75 ;
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_MOVE:
                //        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                //         layoutParams.leftMargin = X - _xDelta-75;

                slider.setX(X - _xDelta);
                //        view.setLayoutParams(layoutParams);
                break;
        }
        //_root.invalidate();
        return true;
    }
}



