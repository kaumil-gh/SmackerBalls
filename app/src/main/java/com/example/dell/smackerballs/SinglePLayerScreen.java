package com.example.dell.smackerballs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class SinglePLayerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);
        setContentView(R.layout.activity_single_player_screen);
    }
}
