package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTemperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        EditText txt1 = (EditText)findViewById(R.id.editTxtInput);
        TextView txtResult = (TextView)findViewById(R.id.txtResult);
        ImageButton btn1 = (ImageButton) findViewById(R.id.convertBtn);
        ImageButton btnSwap = (ImageButton)findViewById(R.id.swapBtn);
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

                if (convertFrom.equals("Celsius") && convertTo.equals("Fahrenheit")){
                    result = (desiredNum * 9 / 5) + 32;
                }else if (convertFrom.equals("Celsius") && convertTo.equals("Kelvin")){
                    result = desiredNum + 273.15;
                }else if (convertFrom.equals("Celsius") && convertTo.equals("Celsius")){
                    result = desiredNum;
                }else if (convertFrom.equals("Fahrenheit") && convertTo.equals("Celsius")){
                    result = (desiredNum - 32)  * 5 / 9;
                }else if (convertFrom.equals("Fahrenheit") && convertTo.equals("Kelvin")){
                    result = (desiredNum - 32)  * 5 / 9 + 273.15;
                }else if (convertFrom.equals("Fahrenheit") && convertTo.equals("Fahrenheit")){
                    result = (desiredNum - 32);
                }else if (convertFrom.equals("Kelvin") && convertTo.equals("Celsius")){
                    result = desiredNum - 273.15;
                }else if (convertFrom.equals("Kelvin") && convertTo.equals("Fahrenheit")){
                    result = (desiredNum - 273.15) * 9 / 5 + 32;
                }else if (convertFrom.equals("Kelvin") && convertTo.equals("Kelvin")){
                    result = (desiredNum - 273.15);
                }

                // Displays the converted value in TextView
                txtResult.setText(String.format("%.4f", result));

            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int positionSpinner1 = spinner1.getSelectedItemPosition();
                int positionSpinner2 = spinner2.getSelectedItemPosition();

                spinner1.setSelection(positionSpinner2);
                spinner2.setSelection(positionSpinner1);

                double swapResult = 0;
                String convertFromSwap = spinner1.getSelectedItem().toString();
                String convertToSwap = spinner2.getSelectedItem().toString();
                double desiredSwapNum = Double.parseDouble(txt1.getText().toString());

                if (convertFromSwap.equals("Celsius") && convertToSwap.equals("Fahrenheit")){
                    swapResult = (desiredSwapNum * 9 / 5) + 32;
                }else if (convertFromSwap.equals("Celsius") && convertToSwap.equals("Kelvin")){
                    swapResult = desiredSwapNum + 273.15;
                }else if (convertFromSwap.equals("Celsius") && convertToSwap.equals("Celsius")){
                    swapResult = desiredSwapNum;
                }else if (convertFromSwap.equals("Fahrenheit") && convertToSwap.equals("Celsius")){
                    swapResult = (desiredSwapNum - 32)  * 5 / 9;
                }else if (convertFromSwap.equals("Fahrenheit") && convertToSwap.equals("Kelvin")){
                    swapResult = (desiredSwapNum - 32)  * 5 / 9 + 273.15;
                }else if (convertFromSwap.equals("Fahrenheit") && convertToSwap.equals("Fahrenheit")){
                    swapResult = (desiredSwapNum);
                }else if (convertFromSwap.equals("Kelvin") && convertToSwap.equals("Celsius")){
                    swapResult = desiredSwapNum - 273.15;
                }else if (convertFromSwap.equals("Kelvin") && convertToSwap.equals("Fahrenheit")){
                    swapResult = (desiredSwapNum - 273.15) * 9 / 5 + 32;
                }else if (convertFromSwap.equals("Kelvin") && convertToSwap.equals("Kelvin")){
                    swapResult = (desiredSwapNum);
                }

                // Displays the converted value in TextView
                txtResult.setText(String.format("%.4f", swapResult));
            }
        });

    }
}