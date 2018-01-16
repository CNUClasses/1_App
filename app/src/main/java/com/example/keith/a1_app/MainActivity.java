package com.example.keith.a1_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    private static final String TAG = "1_IntroApp" ;
    // Animation
    Animation animRotate1;

    //UI widgets
    TextView    mtv;
    Button      myButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a handle to UI elements of interest
        mtv         =(TextView)findViewById(R.id.textView);
        myButton2   =(Button)findViewById(R.id.button2);

        //manually add an anonymous listener for button2, button1 is handled through XML
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.mtv.setText(R.string.text_b2);
            }
        });

        // load the animation
        animRotate1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate1);

        animRotate1.setAnimationListener(this);
        Log.d(TAG, "onCreate: ");
    }

    public void doButton1(View view) {
        mtv.setText(R.string.text_b1);
        Log.d(TAG, "doButton1: logcat tag");
        myButton2.startAnimation(animRotate1);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
