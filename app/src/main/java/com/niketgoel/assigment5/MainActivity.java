package com.niketgoel.assigment5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring variable for Button and TextView
    Button button;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        t = (TextView)findViewById(R.id.blink);

        //setting clicklistener to handle the event when button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.blink_effect);
                t.startAnimation(animation1);
            }

        });

    }



}
