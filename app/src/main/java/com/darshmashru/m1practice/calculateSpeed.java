package com.darshmashru.m1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculateSpeed extends AppCompatActivity {
    float distance, time;
    String speed;
    TextView result;
    public EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_speed);
        e1 = (EditText) findViewById(R.id.enterDistanceSpeed);
        e2 = (EditText) findViewById(R.id.enterTimeSpeed);
        result = findViewById(R.id.speed_result);
    }
    public void calcSpeed(View view){
        distance = Float.parseFloat(e1.getText().toString());
        time = Float.parseFloat(e2.getText().toString());
        speed = String.valueOf(distance/time);
        result.setText(speed);
    }
    public void goBack(View view){
        Intent goBack = new Intent(calculateSpeed.this, MainActivity.class);
        startActivity(goBack);
    }
}