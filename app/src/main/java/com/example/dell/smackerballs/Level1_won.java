package com.example.dell.smackerballs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Level1_won extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);
        Button home;
        Button retry;
        Button next;


        home  = (Button)findViewById(R.id.Home);
        //button2  = (Button)findViewById(R.id.button2);
        retry  = (Button)findViewById(R.id.Retry);
        next  = (Button)findViewById(R.id.Next);

        home.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Level_screen.class));
                    }
                });

        retry.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Level1.class));
                    }
                });
        next.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Level2.class));
                    }
                });
        // for hide the status bar
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

    }
}
