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

public class SI_Calculator extends AppCompatActivity {

    private EditText principalAmountEditText, interestRateEditText, timeEditText;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_calculator);

        principalAmountEditText = findViewById(R.id.principalAmountEditText);
        interestRateEditText = findViewById(R.id.interestRateEditText);
        timeEditText = findViewById(R.id.timeEditText);
        resultTextView = findViewById(R.id.resultTextView);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        String principalAmountString = principalAmountEditText.getText().toString();
        String interestRateString = interestRateEditText.getText().toString();
        String timeString = timeEditText.getText().toString();

        if (TextUtils.isEmpty(principalAmountString) || TextUtils.isEmpty(interestRateString) || TextUtils.isEmpty(timeString)) {
            Toast.makeText(this, "Please enter valid values.", Toast.LENGTH_SHORT).show();
            return;
        }

        double principalAmount = Double.parseDouble(principalAmountString);
        double interestRate = Double.parseDouble(interestRateString);
        double time = Double.parseDouble(timeString);

        double simpleInterest = (principalAmount * interestRate * time) / 100;
        resultTextView.setText(String.format(Locale.getDefault(), "Simple Interest: %.2f", simpleInterest));
    }
}
