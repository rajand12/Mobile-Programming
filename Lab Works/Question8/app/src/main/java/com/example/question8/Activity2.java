package com.example.question8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Person person = (Person) getIntent().getSerializableExtra("person");

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView ageTextView = findViewById(R.id.ageTextView);

        nameTextView.setText("Name: " + person.getName());
        ageTextView.setText("Age: " + person.getAge());
    }
}
