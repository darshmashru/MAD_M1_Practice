package com.darshmashru.m1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculateDistance extends AppCompatActivity {
    float speed, time;
    String distance;
    TextView result;
    public EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_distance);
        e1 = (EditText) findViewById(R.id.enterSpeedDistance);
        e2 = (EditText) findViewById(R.id.enterTimeDistance);
        result = findViewById(R.id.distance_result);
    }
    public void calcDistance(View view){
        speed = Float.parseFloat(e1.getText().toString());
        time = Float.parseFloat(e2.getText().toString());
        distance = String.valueOf(speed * time);
        result.setText(distance);
    }
    public void goBack(View view){
        Intent goBack = new Intent(calculateDistance.this, MainActivity.class);
        startActivity(goBack);
    }
}