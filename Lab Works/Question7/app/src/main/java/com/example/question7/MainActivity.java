package com.example.question7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text_name,text_age,text_address,text_contact;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, second_activity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name","Rajan");
                bundle.putString("age","26");
                bundle.putString("address","Balaju");
                bundle.putString("contact","9860939695");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}