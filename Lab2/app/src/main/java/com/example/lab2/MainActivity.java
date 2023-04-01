package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    Button btn_register;
    Button btn_forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                /*intent.putExtra("name", "Rajan");
                intent.putExtra("age", 25);*/

                //using Bundle
                Bundle bundle = new Bundle();

                bundle.putString("name", "Rajan");
                bundle.putInt("age", 30);

                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
}