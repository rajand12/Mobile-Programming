package com.android.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView myListView;
    String[] dataArray = {"One","Two","Three","Four","Five","Six","Seven","Eight","One","Two","Three","Four","Five","Six","Seven","Eight","One","Two","Three","Four","Five","Six","Seven","Eight"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init
        myListView = findViewById(R.id.list_view);
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dataArray);
        //set adapter
        myListView.setAdapter(adapter);
    }
}
