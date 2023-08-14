package com.android.asianpay;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.android.asianpay.frags.DialogC;
import com.android.asianpay.frags.FragmentA;
import com.android.asianpay.frags.FragmentB;

//todo 1: create 2 layouts as fragment_a.xml and fragment_b.xml
//todo 2: fragment_a.xml should have background color red and fragment_b must have blue
//todo 3: in activity_main.xml use linearlayout root with framelayout followed by two buttons
//todo 4: buttons must be named A and B with id as btn_fragment_a and btn_fragment_b
//todo 5: create class FragmentA and extend Fragment inside fragments package
//todo 6: override onViewCreated and inflate the view `inflater.inflate(layout, container, false)
//todo 7: init buttons in main activity with listeners
//todo 8: use replaceFragment function in listeners

public class MainActivity extends AppCompatActivity {


    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn_fragment_a);
        button2 = findViewById(R.id.btn_fragment_b);
        button3 = findViewById(R.id.btn_dialog_c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentA());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentB());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DialogC().show(getSupportFragmentManager(),DialogC.TAG);
            }
        });

        //fixme code below this line here
        //////////////////////////////////////////


        /////////////////////////////////////////
    }


    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

    }


}
