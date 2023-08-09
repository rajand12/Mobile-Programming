package com.example.question7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class second_activity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = findViewById(R.id.text);

        Intent intent = getIntent();
        if(intent!=null) {
            Bundle bundle = intent.getExtras();
            String name = "" + bundle.getString("name");
            String age = "" + bundle.getString("age");
            String address = "" + bundle.getString("address");
            String contact = "" + bundle.getString("contact");


            String finalText = "Name: " + name + "Age: " + age + "Address: " + address + "Contact: " + contact;


            text.setText(finalText);
        }
        else{
            text.setText("No data found");
        }
    }
}