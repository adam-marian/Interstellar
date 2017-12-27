package com.example.android.interstellar;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable stationAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView stationImage = (ImageView) findViewById(R.id.station);
        stationImage.setBackgroundResource(R.drawable.frames);
        stationAnimation = (AnimationDrawable) stationImage.getBackground();
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            stationAnimation.start();
            return true;
        }
        return super.onTouchEvent(event);
    }

}
