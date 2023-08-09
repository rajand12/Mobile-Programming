package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ContactItem> personList;
    private PersonAdapter personAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        personList = generatePersonData();
        personAdapter = new PersonAdapter(personList);

        recyclerView.setAdapter(personAdapter);
    }

    private List<ContactItem> generatePersonData() {
        List<ContactItem> personList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String name = "Person " + i;
            String address = "Address " + i;
            String contact = "Contact " + i;
            int age = 20 + i;

            ContactItem person = new ContactItem(name, address, contact, age);
            personList.add(person);
        }

        return personList;
    }
}