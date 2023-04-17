package app.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
class User{
    String name,DOB,address;
    int phone;

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(){
        this.DOB = DOB;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(){
        this.address = address;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(){
        this.phone = phone;
    }

}
public class LoginActivity extends AppCompatActivity {
    Button btn_login;
    Button btn_register;
    Button btn_forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        btn_forgotPassword = findViewById(R.id.btn_forgotpassword);
    }

}