package com.example.logindesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating objects
        Button loginButton;
        EditText inputEmail;
        EditText inputPassword;
        //initializing objects
        loginButton = findViewById(R.id.btn_login);
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);

        String email;
        String password;

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inputEmail.getText().toString();
                password = inputPassword.getText().toString();
                if(
                        isValidString(email) && isValidString(password)
                ){

                }else{

                }
            }

        });


    }
//    boolean isValidString(String incomingValue){
//        boolean validity = incomingValue == null || incomingValue.isEmpty()?false:true;
//        return validity;
//    }
    boolean isValidString(String incomingValue){
        return incomingValue != null && !incomingValue.isEmpty();
    }
}