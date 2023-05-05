package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {

    GridView my_grid_view;
    String[] dataArray = {"Ram","Shyam","Hari","Krishna","Ram","Shyam","Hari","Krishna","Ram","Shyam","Hari","Krishna"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        my_grid_view = findViewById(R.id.myGridView);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.grid_item, dataArray);
        my_grid_view.setAdapter(adapter);
    }
}