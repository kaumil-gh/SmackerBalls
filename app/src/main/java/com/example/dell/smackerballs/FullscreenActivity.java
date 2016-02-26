package com.example.dell.smackerballs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.view.Window;

import static android.graphics.Color.TRANSPARENT;
import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);
        setContentView(R.layout.activity_full_screen);
        Button button5;
        button5  = (Button)findViewById(R.id.button5);
        button5.setBackgroundColor(TRANSPARENT);

        button5.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    }
                });
    }
}
