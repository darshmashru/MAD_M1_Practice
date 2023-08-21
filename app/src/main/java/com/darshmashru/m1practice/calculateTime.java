package com.darshmashru.m1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculateTime extends AppCompatActivity {
    float distance, speed;
    String time;
    TextView result;
    public EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_time);
        e1 = (EditText) findViewById(R.id.enterDistanceTime);
        e2 = (EditText) findViewById(R.id.enterSpeedTime);
        result = findViewById(R.id.result_time);
    }

    public void calcTime(View view) {
        distance = Float.parseFloat(e1.getText().toString());
        speed = Float.parseFloat(e2.getText().toString());
        time = String.valueOf(distance / speed);
        result.setText(time);
    }
    public void goBack(View view){
        Intent goBack = new Intent(calculateTime.this, MainActivity.class);
        startActivity(goBack);
    }
}