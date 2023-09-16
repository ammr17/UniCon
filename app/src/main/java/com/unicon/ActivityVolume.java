package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityVolume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        ImageButton convertBtn = (ImageButton) findViewById(R.id.convertBtn);

        EditText txt1 = (EditText)findViewById(R.id.editTxtInput);
        TextView txtResult = (TextView)findViewById(R.id.txtResult);
        ImageButton btnSwap = (ImageButton)findViewById(R.id.swapBtn);
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner_from);
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner_to);

        convertBtn.setOnClickListener(new View.OnClickListener() {
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


                if (convertFrom.equals("Litre") && convertTo.equals("Millilitre")){
                    result = (desiredNum * 1000);
                }else if (convertFrom.equals("Litre") && convertTo.equals("Litre")){
                    result = desiredNum;
                }else if (convertFrom.equals("Litre") && convertTo.equals("Fluid Ounce")){
                    result = desiredNum * 33.81;
                }else if (convertFrom.equals("Millilitre") && convertTo.equals("Litre")){
                    result = desiredNum / 1000;
                }else if (convertFrom.equals("Millilitre") && convertTo.equals("Fluid Ounce")){
                    result = desiredNum / 29.57;
                }else if (convertFrom.equals("Millilitre") && convertTo.equals("Millilitre")){
                    result = desiredNum;
                }else if (convertFrom.equals("Fluid Ounce") && convertTo.equals("Litre")){
                    result = desiredNum / 33.814;
                }else if (convertFrom.equals("Fluid Ounce") && convertTo.equals("Fluid Ounce")){
                    result = desiredNum;
                }else if (convertFrom.equals("Fluid Ounce") && convertTo.equals("Millilitre")){
                    result = desiredNum * 29.574;
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


                if (convertFromSwap.equals("Litre") && convertToSwap.equals("Millilitre")){
                    swapResult = desiredSwapNum * 1000;
                }else if (convertFromSwap.equals("Litre") && convertToSwap.equals("Fluid Ounce")){
                    swapResult = desiredSwapNum * 33.81;
                }else if (convertFromSwap.equals("Litre") && convertToSwap.equals("Litre")){
                    swapResult = desiredSwapNum;
                }else if (convertFromSwap.equals("Millilitre") && convertToSwap.equals("Litre")){
                    swapResult = desiredSwapNum / 1000;
                }else if (convertFromSwap.equals("Millilitre") && convertToSwap.equals("Fluid Ounce")){
                    swapResult = desiredSwapNum / 29.57;
                }else if (convertFromSwap.equals("Millilitre") && convertToSwap.equals("Millilitre")){
                    swapResult = desiredSwapNum;
                }else if (convertFromSwap.equals("Fluid Ounce") && convertToSwap.equals("Litre")){
                    swapResult = desiredSwapNum / 33.814;
                }else if (convertFromSwap.equals("Fluid Ounce") && convertToSwap.equals("Millilitre")){
                    swapResult = desiredSwapNum * 29.574;
                }else if (convertFromSwap.equals("Fluid Ounce") && convertToSwap.equals("Fluid Ounce")){
                    swapResult = desiredSwapNum;
                }

                // Displays the converted value in TextView
                txtResult.setText(String.format("%.4f", swapResult));
            }
        });

    }
}