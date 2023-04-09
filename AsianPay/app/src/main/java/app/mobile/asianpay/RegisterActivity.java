package app.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    RadioGroup genderRadio = (RadioGroup)findViewById(R.id.genderGroup);
    RadioButton male = (RadioButton)findViewById(R.id.btnMale);
    RadioButton female = (RadioButton)findViewById(R.id.btnFemale);
    Button registerButton = findViewById(R.id.btn_register);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(view);
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(view);
            }
        });


    }
    public void onRadioButtonClicked(View view){
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //check which radio button was clicked
        switch(view.getId()){
            case R.id.btnMale:
                if(checked)
                    Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.btnFemale:
                if(checked)
                    Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}