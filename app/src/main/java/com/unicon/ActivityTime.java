package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTime extends AppCompatActivity {
    double value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

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

                if (convertFrom.equals("Second") && convertTo.equals("Minute")){
                    result = (desiredNum / 60) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Hour")){
                    result = (desiredNum / 3600) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Day")){
                    result = (desiredNum / 86400) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Week")){
                    result = (desiredNum / 604800) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Month")){
                    result = (desiredNum / 2628000) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Year")){
                    result = (desiredNum / 31536000) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Second")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Second") && convertTo.equals("Decade")){
                    result = (desiredNum / 315360000) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Second")){
                    result = (desiredNum * 60) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Hour")){
                    result = (desiredNum / 60) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Day")){
                    result = (desiredNum / 1440) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Week")){
                    result = (desiredNum / 10080) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Month")){
                    result = (desiredNum / 43829.1) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Year")){
                    result = (desiredNum / 525949) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Decade")){
                    result = (desiredNum / 5259492) ;
                }else if (convertFrom.equals("Minute") && convertTo.equals("Minute")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Second")){
                    result = (desiredNum * 3600) ;
                }
                else if (convertFrom.equals("Hour") && convertTo.equals("Minute")){
                    result = (desiredNum * 60) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Day")){
                    result = (desiredNum / 24) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Week")){
                    result = (desiredNum / 168) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Month")){
                    result = (desiredNum / 730.484) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Year")){
                    result = (desiredNum / 8760) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Decade")){
                    result = (desiredNum / 87600) ;
                }else if (convertFrom.equals("Hour") && convertTo.equals("Hour")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Second")){
                    result = (desiredNum * 86400) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Minute")){
                    result = (desiredNum * 1440) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Hour")){
                    result = (desiredNum * 24) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Week")){
                    result = (desiredNum / 7) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Month")){
                    result = (desiredNum / 30) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Year")){
                    result = (desiredNum / 365) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Decade")){
                    result = (desiredNum / 3650) ;
                }else if (convertFrom.equals("Day") && convertTo.equals("Day")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Second")){
                    result = (desiredNum * 604800) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Minute")){
                    result = (desiredNum * 10080) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Hour")){
                    result = (desiredNum * 168) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Day")){
                    result = (desiredNum * 7) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Month")){
                    result = (desiredNum / 4) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Year")){
                    result = (desiredNum / 52) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Decade")){
                    result = (desiredNum / 520) ;
                }else if (convertFrom.equals("Week") && convertTo.equals("Week")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Second")){
                    result = (desiredNum * 2628000) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Minute")){
                    result = (desiredNum * 43829.1) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Hour")){
                    result = (desiredNum * 730.484) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Day")){
                    result = (desiredNum * 30) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Week")){
                    result = (desiredNum * 4) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Year")){
                    result = (desiredNum / 12) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Decade")){
                    result = (desiredNum / 120) ;
                }else if (convertFrom.equals("Month") && convertTo.equals("Month")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Second")){
                    result = (desiredNum * 31536000) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Minute")){
                    result = (desiredNum * 525949) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Hour")){
                    result = (desiredNum * 8760) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Day")){
                    result = (desiredNum * 365) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Week")){
                    result = (desiredNum * 52) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Month")){
                    result = (desiredNum * 12) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Decade")){
                    result = (desiredNum / 10) ;
                }else if (convertFrom.equals("Year") && convertTo.equals("Year")){
                    result = (desiredNum) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Second")){
                    result = (desiredNum * 315360000) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Minute")){
                    result = (desiredNum * 5259492) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Hour")){
                    result = (desiredNum *  87600) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Day")){
                    result = (desiredNum * 3650) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Week")){
                    result = (desiredNum * 520) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Month")){
                    result = (desiredNum * 120) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Year")){
                    result = (desiredNum * 10) ;
                }else if (convertFrom.equals("Decade") && convertTo.equals("Decade")){
                    result = (desiredNum) ;
                }
                // Displays the converted value in TextView
                txtResult.setText(String.format("%.4f", result));

            }
        });

    }
    public void conversion(View view){

        //get unit to convert from
        Spinner spinnerFrom = findViewById(R.id.spinner_from);
        String unitFrom = spinnerFrom.getSelectedItem().toString();

        //get unit to convert to
        Spinner spinnerTo = findViewById(R.id.spinner_to);
        String unitTo = spinnerTo.getSelectedItem().toString();

        //get input value
        EditText input = findViewById(R.id.editTxtInput);
        if (input.getText().toString().matches("")){
            Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show();
            return;
        } else {
            value = Double.parseDouble(input.getText().toString());
        }

        TextView result = findViewById(R.id.txtResult);




        //both unit same
        if (unitTo.equals(unitFrom)) {
            result.setText(input.getText());
        }

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
}
