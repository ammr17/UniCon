package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;



public class ActivityArea extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);


        EditText txt1 = (EditText)findViewById(R.id.editTxtInput);
        TextView txtResult = (TextView)findViewById(R.id.txtResult);
        ImageButton btn1 = (ImageButton) findViewById(R.id.convertBtn);
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner_from);
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner_to);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt1.getText().toString().matches("")){
                    Toast.makeText(getBaseContext(), "Please enter input.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = 0;
                String convertFrom = spinner1.getSelectedItem().toString();
                String convertTo = spinner2.getSelectedItem().toString();
                double desiredNum = Double.parseDouble(txt1.getText().toString());

                if (convertFrom.equals("Square Meter") && convertTo.equals("Square Foot")){
                    result = desiredNum * 10.76391;
                }else if (convertFrom.equals("Square Meter") && convertTo.equals("Square Milimeter")){
                    result = desiredNum * 1000000;
                }else if (convertFrom.equals("Square Meter") && convertTo.equals("Square Meter")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Meter") && convertTo.equals("Square Centimeter")){
                    result = desiredNum * 10000;
                }else if (convertFrom.equals("Square Meter") && convertTo.equals("Square Kilometer")){
                    result = desiredNum * (10*-6);
                }else if (convertFrom.equals("Square Meter") && convertTo.equals("Square Inches")){
                    result = desiredNum * 15504;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Foot")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Meter")){
                    result = desiredNum * 0.09290304;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Milimeter")){
                    result = desiredNum * 92903;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Centimeter")){
                    result = desiredNum * 929.03;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Kilometer")){
                    result = desiredNum *  0.000000092903;
                }else if (convertFrom.equals("Square Foot") && convertTo.equals("Square Inches")) {
                    result = desiredNum * 144;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Inches")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Kilometer")) {
                    result = desiredNum * 0.00000000064516;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Milimeter")) {
                    result = desiredNum * 645.16;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Centimeter")) {
                    result = desiredNum * 6.4516;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Meter")){
                    result = desiredNum * 0.00064516;
                }else if (convertFrom.equals("Square Inches") && convertTo.equals("Square Foot")){
                    result = desiredNum * 0.00694444;
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Kilometer")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Inches")){
                    result = desiredNum * 1550003100;
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Milimeter")){
                    result = desiredNum * 0.000000000001;
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Centimeter")){
                    result = desiredNum * (10*10);
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Meter")){
                    result = desiredNum * 1000000;
                }else if (convertFrom.equals("Square Kilometer") && convertTo.equals("Square Foot")){
                    result = desiredNum * 0.00001076;
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Milimeter")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Centimeter")){
                    result = desiredNum * 0.01;
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Meter")){
                    result = desiredNum * 0.000001;
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Kilometer")){
                    result = desiredNum * (10*12);
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Inches")){
                    result = desiredNum * 0.00155;
                }else if (convertFrom.equals("Square Milimeter") && convertTo.equals("Square Foot")){
                    result = desiredNum * 0.000010764;
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Centimeter")){
                    result = desiredNum;
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Milimeter")){
                    result = desiredNum * 100;
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Meter")){
                    result = desiredNum * 0.0001;
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Kilometer")){
                    result = desiredNum * (10*10);
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Inches")){
                    result = desiredNum * 0.155;
                }else if (convertFrom.equals("Square Centimeter") && convertTo.equals("Square Foot")){
                    result = desiredNum * 0.0010763888889;
                }

                // Displays the converted value in TextView
                txtResult.setText(String.format("%.4f", result));

            }
        });
    }

    public void swapUnits(View view){

        Spinner spinnerFrom = findViewById(R.id.spinner_from);
        Spinner spinnerTo = findViewById(R.id.spinner_to);

        int tempSpinner = spinnerTo.getSelectedItemPosition();
        spinnerTo.setSelection(spinnerFrom.getSelectedItemPosition());
        spinnerFrom.setSelection(tempSpinner);

        EditText input = findViewById(R.id.editTxtInput);
        TextView result = findViewById(R.id.txtResult);

        String tempResult = input.getText().toString();
        input.setText(result.getText().toString());
        result.setText(tempResult);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}