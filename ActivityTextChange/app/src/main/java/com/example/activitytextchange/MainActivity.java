package com.example.activitytextchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton ;
        TextView myText;
        myText = findViewById(R.id.text1);
        myButton = findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    int value = Integer.parseInt(myText.getText().toString());
                    value++;
                    myText.setText(String.valueOf(value));
                }
        });
    }

}