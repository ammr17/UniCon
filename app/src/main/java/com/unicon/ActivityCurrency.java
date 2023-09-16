package com.unicon;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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

import org.json.JSONObject;


public class ActivityCurrency extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//    private void test(){
//        String url_str = "https://api.exchangerate.host/convert?from=USD&to=EUR";
//
//        URL url = new URL(url_str);
//        HttpURLConnection request = (HttpURLConnection) url.openConnection();
//        request.connect();
//
//        JSONParser jp = new JsonParser();
//        JSONElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//        JSONObject jsonobj = root.getAsJsonObject();
//
//        String req_result = jsonobj.get("result").getAsString();
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);


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

                if (convertFrom.equals("US Dollar") && convertTo.equals("Euro")){
                    result = desiredNum * 0.9200934;
                }else if (convertFrom.equals("US Dollar") && convertTo.equals("Malaysian Ringgit")){
                    result = desiredNum * 4.4181307;
                }else if (convertFrom.equals("US Dollar") && convertTo.equals("Japanese Yen")){
                    result = desiredNum * 130.79862;
                }else if (convertFrom.equals("US Dollar") && convertTo.equals("Korean Won")){
                    result = desiredNum * 1282.5558;
                }else if (convertFrom.equals("US Dollar") && convertTo.equals("Great Britain Pound")){
                    result = desiredNum * 0.81308861;
                }else if (convertFrom.equals("US Dollar") && convertTo.equals("US Dollar")){
                    result = desiredNum;
                }else if (convertFrom.equals("Euro") && convertTo.equals("US Dollar")){
                    result = desiredNum * 1.0868627;
                }else if (convertFrom.equals("Euro") && convertTo.equals("Malaysian Ringgit")){
                    result = desiredNum * 4.8020352;
                }else if (convertFrom.equals("Euro") && convertTo.equals("Japanese Yen")){
                    result = desiredNum * 142.15029;
                }else if (convertFrom.equals("Euro") && convertTo.equals("Korean Won")){
                    result = desiredNum *  1393.9621;
                }else if (convertFrom.equals("Euro") && convertTo.equals("Great Britain Pound")) {
                    result = desiredNum * 0.883795;
                }else if (convertFrom.equals("Euro") && convertTo.equals("Euro")) {
                    result = desiredNum;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("US Dollar")){
                    result = desiredNum * 0.22634196;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("Euro")){
                    result = desiredNum * 0.20861422;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("Japanese Yen")){
                    result = desiredNum * 29.439163;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("Korean Won")){
                    result = desiredNum *  292.21539;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("Great Britain Pound")) {
                    result = desiredNum * 0.18399287;
                }else if (convertFrom.equals("Malaysian Ringgit") && convertTo.equals("Malaysian Ringgit")) {
                    result = desiredNum;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("US Dollar")){
                    result = desiredNum *0.007674036;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("Euro")){
                    result = desiredNum * 0.0070862017;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("Malaysian Ringgit")){
                    result = desiredNum * 0.033968008;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("Korean Won")){
                    result = desiredNum *  9.9272232;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("Great Britain Pound")) {
                    result = desiredNum * 0.0062499888;
                }else if (convertFrom.equals("Japanese Yen") && convertTo.equals("Japanese Yen")) {
                    result = desiredNum;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("US Dollar")){
                    result = desiredNum * 0.00077327805;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("Euro")){
                    result = desiredNum * 0.00071400611;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("Malaysian Ringgit")){
                    result = desiredNum * 0.0034228496;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("Japanese Yen")){
                    result = desiredNum *  0.10078176;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("Great Britain Pound")) {
                    result = desiredNum * 0.00062976258;
                }else if (convertFrom.equals("Korean Won") && convertTo.equals("Korean Won")) {
                    result = desiredNum;
                }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("US Dollar")){
                    result = desiredNum * 0.09290304;
                }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("Euro")){
                    result = desiredNum * 1.2278882;
                }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("Malaysian Ringgit")){
                    result = desiredNum * 5.435143;
                }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("Japanese Yen")){
                    result = desiredNum *  160.03136;
                }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("Korean Won")) {
                    result = desiredNum * 1587.9;
                 }else if (convertFrom.equals("Great Britain Pound") && convertTo.equals("Great Britain Pound")) {
                    result = desiredNum;
                }

                // Displays the converted value in TextView

                txtResult.setText(String.format("%.4f",result));


            }
        });}

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

