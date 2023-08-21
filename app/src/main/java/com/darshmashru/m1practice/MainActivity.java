package com.darshmashru.m1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);

        String[] choices = {
                "Select an option",
                "Calculate Speed",
                "Calculate Distance",
                "Calculate Time",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, choices);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        Intent speedintent = new Intent(MainActivity.this, calculateSpeed.class);
                        startActivity(speedintent);
                        break;
                    case 2:
                        Intent distanceintent = new Intent(MainActivity.this, calculateDistance.class);
                        startActivity(distanceintent);
                        break;
                    case 3:
                        Intent timeintent = new Intent(MainActivity.this, calculateTime.class);
                        startActivity(timeintent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
//               Nothing is done
            }
        });
    }
}