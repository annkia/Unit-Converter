package com.example.ania.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Length Unit Converter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ButtonConvMilesToKm= (Button) findViewById(R.id.ButtonConvMilesToKm);
        ButtonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm= (EditText) findViewById(R.id.editTextKm);
                double vMiles= Double.valueOf(textBoxMiles.getText().toString());
                double vKm= vMiles /0.62137;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));
            }
        });


        Button ButtonConvKmToMiles= (Button) findViewById(R.id.ButtonConvKmToMiles);
        ButtonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm= (EditText) findViewById(R.id.editTextKm);
                double vKm= Double.valueOf(textBoxKm.getText().toString());
                double vMiles= vKm *0.62137;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });

        Button ButtonConvMetreToFeet= (Button) findViewById(R.id.ButtonConvMetreToFeet);
        ButtonConvMetreToFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMetre= (EditText) findViewById(R.id.editTextMetre);
                EditText textBoxFeet= (EditText) findViewById(R.id.editTextFeet);
                double vMetre= Double.valueOf(textBoxMetre.getText().toString());
                double vFeet= vMetre *3.28083;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxFeet.setText(formatVal.format(vFeet));
            }
        });

        Button ButtonConvFeetToMetre= (Button) findViewById(R.id.ButtonConvFeetToMetre);
        ButtonConvFeetToMetre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxFeet= (EditText) findViewById(R.id.editTextFeet);
                EditText textBoxMetre= (EditText) findViewById(R.id.editTextMetre);
                double vFeet= Double.valueOf(textBoxFeet.getText().toString());
                double vMetre= vFeet *0.3048;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxMetre.setText(formatVal.format(vMetre));
            }
        });

        Button ButtonConvCmToInch= (Button) findViewById(R.id.ButtonConvCmToInch);
        ButtonConvCmToInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxCm= (EditText) findViewById(R.id.editTextCm);
                EditText textBoxInch= (EditText) findViewById(R.id.editTextInch);
                double vCm= Double.valueOf(textBoxCm.getText().toString());
                double vInch= vCm *0.39370;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxInch.setText(formatVal.format(vInch));
            }
        });


        Button ButtonConvInchToCm= (Button) findViewById(R.id.ButtonConvInchToCm);
        ButtonConvInchToCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxInch= (EditText) findViewById(R.id.editTextInch);
                EditText textBoxCm= (EditText) findViewById(R.id.editTextCm);
                double vInch= Double.valueOf(textBoxInch.getText().toString());
                double vCm= vInch *2.54;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textBoxCm.setText(formatVal.format(vCm));
            }
        });


    }
}
