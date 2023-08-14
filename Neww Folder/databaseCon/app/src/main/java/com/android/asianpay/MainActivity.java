package com.android.asianpay;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.List;
import java.util.Map;


//todo 1: before starting download
//todo https://sqlitebrowser.org/dl/

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    DBHandler dbHandler;
    Button save;
    Button view;
    EditText courseName;
    EditText courseDuration;


    //todo 2 manifest add permission external storage
    //todo 3 make DBHandler java -> continue here ---------------->
    //todo 3.1: create UI in activity_main with 2 editText and 2 buttons
    //todo 11: make 2 editText for input courseName and courseDuration
    //todo 12: make 2 buttons to save and show data
    //todo 13: object for dbHandler


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 14: init dbHandler

        dbHandler = new DBHandler(MainActivity.this);
        ////////////////////////////////////////////////////////////////////////////////////////////


        //todo 15: findViewById all views
        save = findViewById(R.id.addCourse);
        view = findViewById(R.id.viewCourse);
        courseName = findViewById(R.id.courseName);
        courseDuration = findViewById(R.id.courseDuration);

        ////////////////////////////////////////////////////////////////////////////////////////////

        //todo 16: event handle on save and call the dbHandler.addNewCourse() to send data to db;
        //todo 16: show toast after course is added
        // todo 16: clear editText fields

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (courseName.getText().toString().isEmpty() || courseDuration.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Empty field/s", Toast.LENGTH_SHORT).show();
                    return;
                }
                dbHandler.addNewCourse(courseName.getText().toString(), courseDuration.getText().toString());
                Toast.makeText(MainActivity.this, "Course Added", Toast.LENGTH_SHORT).show();
                courseName.setText("");
                courseDuration.setText("");
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////


        //todo 17: event handle for show
        //todo 17 : paste the code below inside the body to read data from List of Map

/*
         List<Map<String, String>> courses = dbHandler.getAllCourses();
                for (Map<String, String> item :
                        courses) {
                    Log.d(TAG, "items : " + item.get("id") + "\n");
                    Log.d(TAG, "items : " + item.get("name") + "\n");
                    Log.d(TAG, "items : " + item.get("duration") + "\n\n");
                }

*/
    }

}
