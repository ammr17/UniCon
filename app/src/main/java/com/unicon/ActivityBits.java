package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityBits extends AppCompatActivity {

    public void convert(View view){
        Spinner spinnerFrom = findViewById(R.id.spinner_from);
        String unitFrom = spinnerFrom.getSelectedItem().toString();

        //get unit to convert to
        Spinner spinnerTo = findViewById(R.id.spinner_to);
        String unitTo = spinnerTo.getSelectedItem().toString();

        double dblVal = 0;

        //get input value
        EditText input = findViewById(R.id.editTxtInput);
        if (input.getText().toString().matches("")){
            Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show();
            return;
        } else {
            dblVal = Double.parseDouble(input.getText().toString());
        }

        TextView result = findViewById(R.id.txtResult);

        double num = 0;

        if(unitFrom.equals("Bits")){
            Bits bt = new Bits(dblVal);

            // double num = 0;

            switch (unitTo) {
                case "Bits":
                    num = bt.toBits();
                    break;
                case "Byte (B)":
                    num = bt.toByte();
                    break;
                case "Kilobyte (KB)":
                    num = bt.toKb();
                    break;
                case "Megabyte (MB)":
                    num = bt.toMb();
                    break;
                case "Gigabyte (GB)":
                    num = bt.toGb();
                    break;
                case "Terabyte (TB)":
                    num = bt.toTb();
                    break;
                default:{

                }
            }

            result.setText(String.format("%.10f", num));
        }

        else if(unitFrom.equals("Byte (B)")){
            Byte byt = new Byte(dblVal);

            switch (unitTo){
                case "Bits":
                    num = byt.toBits();
                    break;
                case "Byte (B)":
                    num = byt.toByte();
                    break;
                case "Kilobyte (KB)":
                    num = byt.toKb();
                    break;
                case "Megabyte (MB)":
                    num = byt.toMb();
                    break;
                case "Gigabyte (GB)":
                    num = byt.toGb();
                    break;
                case "Terabyte (TB)":
                    num = byt.toTb();
                    break;
                default:{

                }
            }

            result.setText(String.format("%.10f", num));
        }

        else if(unitFrom.equals("Kilobyte (KB)")){
            KiloBytes kb = new KiloBytes(dblVal);

            switch (unitTo) {
                case "Bits":
                    num = kb.toBits();
                    break;
                case "Byte (B)":
                    num = kb.toByte();
                    break;
                case "Kilobyte (KB)":
                    num = kb.toKb();
                    break;
                case "Megabyte (MB)":
                    num = kb.toMb();
                    break;
                case "Gigabyte (GB)":
                    num = kb.toGb();
                    break;
                case "Terabyte (TB)":
                    num = kb.toTb();
                    break;
                default: {

                }
            }

            result.setText(String.format("%.10f", num));
        }

        else if(unitFrom.equals("Megabyte (MB)")){
            MegaByte mb = new MegaByte(dblVal);

            switch (unitTo) {
                case "Bits":
                    num = mb.toBits();
                    break;
                case "Byte (B)":
                    num = mb.toByte();
                    break;
                case "Kilobyte (KB)":
                    num = mb.toKb();
                    break;
                case "Megabyte (MB)":
                    num = mb.toMb();
                    break;
                case "Gigabyte (GB)":
                    num = mb.toGb();
                    break;
                case "Terabyte (TB)":
                    num = mb.toTb();
                    break;
                default: {

                }
            }

            result.setText(String.format("%.10f", num));
        }

        else if(unitFrom.equals("Gigabyte (GB)")){
            GigaByte gb = new GigaByte(dblVal);

            switch (unitTo) {
                case "Bits":
                    gb.toBits();
                    break;
                case "Byte (B)":
                    gb.toByte();
                    break;
                case "Kilobyte (KB)":
                    gb.toKb();
                    break;
                case "Megabyte (MB)":
                    gb.toMb();
                    break;
                case "Gigabyte (GB)":
                    gb.toGb();
                    break;
                case "Terabyte (TB)":
                    gb.toTb();
                    break;
                default: {

                }
            }

            result.setText(String.format("%.10f", num));
        }

        else if(unitFrom.equals("Terabyte (TB)")){
            TeraByte tb = new TeraByte(dblVal);

            switch (unitTo) {
                case "Bits":
                    tb.toBits();
                    break;
                case "Byte (B)":
                    tb.toByte();
                    break;
                case "Kilobyte (KB)":
                    tb.toKb();
                    break;
                case "Megabyte (MB)":
                    tb.toMb();
                    break;
                case "Gigabyte (GB)":
                    tb.toGb();
                    break;
                case "Terabyte (TB)":
                    tb.toTb();
                    break;
                default: {

                }
            }

            result.setText(String.format("%.10f", num));
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bits);

        ImageButton convBtn = (ImageButton) findViewById(R.id.convertBtn);

        convBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert(view);
            }
        });
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
}




