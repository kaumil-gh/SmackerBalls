package com.example.dell.smackerballs;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_2);

        Button button1;
        Button button2;
        Button button3;
        Button button4;

        button1  = (Button)findViewById(R.id.button1);
        button2  = (Button)findViewById(R.id.button2);
        button3  = (Button)findViewById(R.id.button3);
        button4  = (Button)findViewById(R.id.button4);

        button1.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), SinglePlayerScreen.class));
                    }
                });
        button2.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), ConnectivityModule.class));
                    }
                });
        button3.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                    }
                });
        button4.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Instructions.class));
                    }
                });
    }
}
