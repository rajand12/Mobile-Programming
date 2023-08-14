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

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// set volley dependencies
// use internet permissions


public class MainActivity extends AppCompatActivity {

    private static final String productUrl = "https://fakestoreapi.com/products";

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //todo 1: create url variable which contains product url

        String url = productUrl;
        String newUrl = productUrl+"/1";

        //todo 2: create a requestQueue object as Volley.newRequest(context);

        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

        //todo 3: create new JsonArrayRequest object with constructor params url, response, error respectively

//        JsonArrayRequest request = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//                Log.d(TAG, "response: " + response);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//            }
//        });

        JsonObjectRequest objectRequest = new JsonObjectRequest(newUrl,response -> {
            Log.d(TAG, "Response"+response);
        }, error -> {});

        //todo 3: add the jsonArrayRequest to queue

        //requestQueue.add(request);
        requestQueue.add(objectRequest);
        //todo 4: log into debugger for incoming response data
        //todo 5: run see logcat
        //todo 6: perform this action with button action event


    }
}
