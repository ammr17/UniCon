package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAngle(View view){
        Intent i = new Intent(getApplicationContext(), ActivityAngle.class);
        startActivity(i);
    }

    public void showTemperature(View view){
        Intent i = new Intent(getApplicationContext(), ActivityTemperature.class);
        startActivity(i);
    }

    public void showLength(View view){
        Intent i = new Intent(getApplicationContext(), ActivityLength.class);
        startActivity(i);
    }

    public void showArea(View view){
        Intent i = new Intent(getApplicationContext(), ActivityArea.class);
        startActivity(i);
    }

    public void showVolume(View view){
        Intent i = new Intent(getApplicationContext(), ActivityVolume.class);
        startActivity(i);
    }

    public void showTime(View view){
        Intent i = new Intent(getApplicationContext(), ActivityTime.class);
        startActivity(i);
    }

    public void showMass(View view){
        Intent i = new Intent(getApplicationContext(), ActivityMass.class);
        startActivity(i);
    }

    public void showCurrency(View view){
        Intent i = new Intent(getApplicationContext(), ActivityCurrency.class);
        startActivity(i);
    }

    public void showPressure(View view){
        Intent i = new Intent(getApplicationContext(), ActivityPressure.class);
        startActivity(i);
    }

    public void showBits(View view){
        Intent i = new Intent(getApplicationContext(), ActivityBits.class);
        startActivity(i);
    }
}