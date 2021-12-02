package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressLint("CustomSplashScreen")
public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    }
    public void btn1AREA_OF_SQUARE(View view ) {
        Intent intent = new Intent(splashscreen.this,AREA_OF_SQUARE.class);
        startActivity(intent);
    }

    public void btn2AREA_OF_RECTANGLE(View view ) {
        Intent  intent=new Intent( splashscreen.this,AREA_OF_RECTANGLE.class);
        startActivity(intent);
    }
    public void btn3AREA_OF_CIRCLE(View view ) {
        Intent intent = new Intent(splashscreen.this, AREA_OF_CIRCLE.class);
        startActivity(intent);
    }
    public void btn4AREA_OF_TRIANGLE(View view ) {
        Intent intent = new Intent(splashscreen.this, AREA_OF_TRIANGLE.class);
        startActivity(intent);
    }
}