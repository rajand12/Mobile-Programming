package com.example.may9thclasswork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class EMI_Calculator extends AppCompatActivity {

    private EditText loanAmountEditText, interestRateEditText, tenureEditText;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);

        loanAmountEditText = findViewById(R.id.loanAmountEditText);
        interestRateEditText = findViewById(R.id.interestRateEditText);
        tenureEditText = findViewById(R.id.tenureEditText);
        resultTextView = findViewById(R.id.resultTextView);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateEmi();
            }
        });
    }

    private void calculateEmi() {
        String loanAmountString = loanAmountEditText.getText().toString();
        String interestRateString = interestRateEditText.getText().toString();
        String tenureString = tenureEditText.getText().toString();

        if (TextUtils.isEmpty(loanAmountString) || TextUtils.isEmpty(interestRateString) || TextUtils.isEmpty(tenureString)) {
            Toast.makeText(this, "Please enter valid values.", Toast.LENGTH_SHORT).show();
            return;
        }

        double loanAmount = Double.parseDouble(loanAmountString);
        double interestRate = Double.parseDouble(interestRateString);
        double tenure = Double.parseDouble(tenureString);

        double monthlyInterestRate = (interestRate / 12) / 100;
        double numerator = loanAmount * monthlyInterestRate;

        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -tenure);
        double emi = numerator / denominator;

        resultTextView.setText(String.format(Locale.getDefault(), "EMI: %.2f", emi));
    }

}