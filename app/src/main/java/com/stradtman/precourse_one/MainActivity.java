package com.stradtman.precourse_one;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonDemo;
    LinearLayout backgroundLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundLayout = findViewById(R.id.background_layout);
        buttonDemo = findViewById(R.id.button_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo", "The demo button was clicked!");
                backgroundLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            }
        });
    }
}
