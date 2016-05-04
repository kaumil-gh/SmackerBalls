package com.example.dell.smackerballs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level_screen extends AppCompatActivity {

    Button level1 ;
    Button level2 ;
    Button level3 ;
    Button level4 ;
    Button level5 ;
    Button level6 ;
    Button level7 ;
    Button level8 ;
    Button level9 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);
        level1 = (Button)findViewById(R.id.level1);
        level2 = (Button)findViewById(R.id.level2);
        level3 = (Button)findViewById(R.id.level3);
        level4 = (Button)findViewById(R.id.level4);
        level5 = (Button)findViewById(R.id.level5);
        level6 = (Button)findViewById(R.id.level6);
        level7 = (Button)findViewById(R.id.level7);
        level8 = (Button)findViewById(R.id.level8);
        level9 = (Button)findViewById(R.id.level9);


        level1.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                                  startActivity(new Intent(getApplicationContext(),Level1.class));
                    }
                });

        level2.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level2.class));
                    }
                });

        level3.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level3.class));
                    }
                });

        level4.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level4.class));
                    }
                });

        level5.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level5.class));
                    }
                });

        level6.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Level6.class));
                    }
                });

        level7.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level7.class));
                    }
                });

        level8.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level8.class));
                    }
                });

        level9.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Level9.class));
                    }
                });
    }
}
