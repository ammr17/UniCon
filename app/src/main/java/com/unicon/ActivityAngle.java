package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityAngle extends AppCompatActivity {

    //attributes
//    private double value;
//    private final double pi = Math.PI;
//
//    //create inheritance class from Angle
//    public class Degree extends ActivityAngle{
//
//        //methods for conversion calculation
//        public double degreeToRadian(double value){
//            return(value * pi / 180);
//        }
//
//        public double degreeToDegree(double value){
//            return(value);
//        }
//    }
//
//    //create inheritance class from Angle
//    public class Radian extends ActivityAngle{
//
//        //methods for conversion calculation
//        public double radianToDegree(double value){
//            return(value * 180 / pi);
//        }
//
//        public double radianToRadian(double value){
//            return(value);
//        }
//    }





    @SuppressLint("DefaultLocale")
    public void conversion(View view){

        //get unit to convert from
        Spinner spinnerFrom = findViewById(R.id.spinner_from);
        String unitFrom = spinnerFrom.getSelectedItem().toString();

        //get unit to convert to
        Spinner spinnerTo = findViewById(R.id.spinner_to);
        String unitTo = spinnerTo.getSelectedItem().toString();

        //set textview for result display
        TextView result = findViewById(R.id.txtResult);
        double value = 0;

        //get input value
        EditText input = findViewById(R.id.editTxtInput);
        if (input.getText().toString().matches("")){
            Toast.makeText(this, "Please enter input.", Toast.LENGTH_SHORT).show();
            return;
        } else {
            value = Double.parseDouble(input.getText().toString());
        }

        //convert from radian
        if (unitFrom.equals("Radian")) {
            Radian conv = new Radian(value);

            if (unitTo.equals("Degree")) {
                value = conv.toDegree();
            } else if (unitTo.equals("Radian")) {
                value = conv.toRadian();
            }
        }
        //convert from degree
        else if (unitFrom.equals("Degree")) {
            Degree conv = new Degree(value);

            if  (unitTo.equals("Radian")){
                value = conv.toRadian();
            } else if (unitTo.equals("Degree")) {
                value = conv.toDegree();
            }
        }

        //display result
        result.setText(String.format("%.4f", value));

    }

    public void swapUnits(View view){

        //create variables from the spinners
        Spinner spinnerFrom = findViewById(R.id.spinner_from);
        Spinner spinnerTo = findViewById(R.id.spinner_to);

        //create variable to store the input and result
        EditText input = findViewById(R.id.editTxtInput);
        TextView result = findViewById(R.id.txtResult);

        //set temporary variables to store the chosen unit and input
        int tempSpinner = spinnerTo.getSelectedItemPosition();
        String tempResult = input.getText().toString();

        //swap the spinner values
        spinnerTo.setSelection(spinnerFrom.getSelectedItemPosition());
        spinnerFrom.setSelection(tempSpinner);

        //swap the input and result
        input.setText(result.getText().toString());
        result.setText(tempResult);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //display the Angle page layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);
    }
}