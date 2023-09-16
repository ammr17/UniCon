package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLength extends AppCompatActivity {
    double value;

    public class Milimeter extends ActivityLength{
        public double mmToCm(double value){
            return value / 10.0;
        }
        public double mmToM(double value){
            return value / 1000.0;
        }
        public double mmToMi(double value){
            return value / 1609344.0;
        }
        public double mmToYd(double value) {
            return value / 914.4;
        }
        public double mmToIn(double value) {
            return value / 25.4;
        }
        public double mmToFt(double value) {
            return value / 304.8;
        }
        public double mmToKm(double value) {
            return value / 1000000.0;
        }
    }

    public class Centimeter extends ActivityLength {
        public double cmToMm(double value) {
            return value * 10.0;
        }

        public double cmToM(double value) {
            return value / 100.0;
        }

        public double cmToMi(double value) {
            return value / 160934.4;
        }

        public double cmToYd(double value) {
            return value / 91.44;
        }

        public double cmToIn(double value) {
            return value / 2.54;
        }

        public double cmToFt(double value) {
            return value / 30.48;
        }

        public double cmToKm(double value) {
            return value / 100000.0;
        }
    }
    public class Meter extends ActivityLength {
        public double mToMm(double value) {
            return value * 1000.0;
        }

        public double mToCm(double value) {
            return value * 100.0;
        }

        public double mToMi(double value) {
            return value / 1609.0;
        }

        public double mToYd(double value) {
            return value * 1.094;
        }

        public double mToIn(double value) {
            return value * 39.37;
        }

        public double mToFt(double value) {
            return value * 3.281;
        }

        public double mToKm(double value) {
            return value / 1000.0;
        }
    }
    public class Miles extends ActivityLength {
        public double miToMm(double value) {
            return value * 1609344;
        }

        public double miToCm(double value) {
            return value * 160934.4;
        }

        public double miToM(double value) {
            return value * 1609.344;
        }

        public double miToYd(double value) {
            return value * 1760;
        }

        public double miToIn(double value) {
            return value * 63360;
        }

        public double miToFt(double value) {
            return value * 5280;
        }

        public double miToKm(double value) {
            return value * 1.609344;
        }
    }
    public class Yard extends ActivityLength {
        public double ydToMm(double value) {
            return value * 914.4;
        }

        public double ydToCm(double value) {
            return value * 91.44;
        }

        public double ydToM(double value) {
            return value * 0.9144;
        }

        public double ydToMi(double value) {
            return value / 1760;
        }

        public double ydToIn(double value) {
            return value * 36;
        }

        public double ydToFt(double value) {
            return value * 3;
        }

        public double ydToKm(double value) {
            return value * 0.0009144;
        }
    }
    public class Inches extends ActivityLength {
        public double inToMm(double value) {
            return value * 25.4;
        }

        public double inToCm(double value) {
            return value * 2.54;
        }

        public double inToM(double value) {
            return value * 0.0254;
        }

        public double inToMi(double value) {
            return value / 63360;
        }

        public double inToYd(double value) {
            return value / 36;
        }

        public double inToFt(double value) {
            return value / 12;
        }

        public double inToKm(double value) {
            return value * 0.0000254;
        }
    }
    public class Feet extends ActivityLength {
        public double ftToMm(double value) {
            return value * 304.8;
        }

        public double ftToCm(double value) {
            return value * 30.48;
        }

        public double ftToM(double value) {
            return value * 0.3048;
        }

        public double ftToMi(double value) {
            return value / 5280;
        }

        public double ftToYd(double value) {
            return value / 3;
        }

        public double ftToIn(double value) {
            return value * 12;
        }

        public double ftToKm(double value) {
            return value / 3280.84;
        }
    }
    public class Kilometer extends ActivityLength {
        public double kmToMm(double value) {
            return value * 1000000;
        }

        public double kmToCm(double value) {
            return value * 100000;
        }

        public double kmToM(double value) {
            return value * 1000;
        }

        public double kmToMi(double value) {
            return value / 1.609344;
        }

        public double kmToYd(double value) {
            return value * 1093.61;
        }

        public double kmToIn(double value) {
            return value * 39370.1;
        }

        public double kmToFt(double value) {
            return value * 3280.84;
        }
    }

    @SuppressLint("DefaultLocale")
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
            Toast.makeText(this, "Please enter input.", Toast.LENGTH_SHORT).show();
            return;
        } else {
            value = Double.parseDouble(input.getText().toString());
        }

        TextView result = findViewById(R.id.txtResult);

        if (unitFrom.equals("Milimeter")) {
            ActivityLength.Milimeter conv = new ActivityLength.Milimeter();

            if (unitTo.equals("Centimeter")) {
                value = conv.mmToCm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Meter")) {
                value = conv.mmToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.mmToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.mmToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.mmToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.mmToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.mmToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Centimeter")) {
            ActivityLength.Centimeter conv = new ActivityLength.Centimeter();

            if (unitTo.equals("Milimeter")) {
                value = conv.cmToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Meter")) {
                value = conv.cmToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.cmToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.cmToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.cmToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.cmToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.cmToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Meter")) {
            ActivityLength.Meter conv = new ActivityLength.Meter();

            if (unitTo.equals("Milimeter")) {
                value = conv.mToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.mToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.mToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.mToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.mToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.mToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.mToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Miles")) {
            ActivityLength.Miles conv = new ActivityLength.Miles();

            if (unitTo.equals("Milimeter")) {
                value = conv.miToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.miToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Meter")) {
                value = conv.miToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.miToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.miToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.miToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.miToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Yard")) {
            ActivityLength.Yard conv = new ActivityLength.Yard();

            if (unitTo.equals("Milimeter")) {
                value = conv.ydToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.ydToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Meter")) {
                value = conv.ydToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.ydToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.ydToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.ydToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.ydToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }
        if (unitFrom.equals("Inches")) {
            ActivityLength.Inches conv = new ActivityLength.Inches();

            if (unitTo.equals("Milimeter")) {
                value = conv.inToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.inToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Meter")) {
                value = conv.inToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.inToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.inToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.inToFt(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.inToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Feet")) {
            ActivityLength.Feet conv = new ActivityLength.Feet();

            if (unitTo.equals("Milimeter")) {
                value = conv.ftToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.ftToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Meter")) {
                value = conv.ftToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.ftToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.ftToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.ftToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Kilometer")) {
                value = conv.ftToKm(value);
                result.setText(String.format("%.4f", value));
            }
        }

        if (unitFrom.equals("Kilometer")) {
            ActivityLength.Kilometer conv = new ActivityLength.Kilometer();

            if (unitTo.equals("Milimeter")) {
                value = conv.kmToMm(value);
                result.setText(String.format("%.4f", value));
            } else if (unitTo.equals("Centimeter")) {
                value = conv.kmToCm(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Meter")) {
                value = conv.kmToM(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Miles")) {
                value = conv.kmToMi(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Yard")) {
                value = conv.kmToYd(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Inches")) {
                value = conv.kmToIn(value);
                result.setText(String.format("%.4f", value));
            }
            else if (unitTo.equals("Feet")) {
                value = conv.kmToFt(value);
                result.setText(String.format("%.4f", value));
            }
        }

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
    }
}
