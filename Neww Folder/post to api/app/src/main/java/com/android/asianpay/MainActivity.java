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
import org.json.JSONException;
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

        //todo 2: create a requestQueue object as Volley.newRequest(context);

        RequestQueue queue = Volley.newRequestQueue(this);

        //todo 3: create new JsonObjectRequest object with constructor params : POST Method,url, JSON request body,  response, error respectively

        JsonObjectRequest obj = new JsonObjectRequest(Request.Method.POST,url,getMacbookModel(),response -> {},error -> {});

        //todo 3: add the JsonObjectRequest to queue

        queue.add(obj);

        //todo 4: log into debugger for incoming response data

        Log.d(TAG, "onCreate: Hahaha");

        //todo 5: run see logcat




    }


    JSONObject getMacbookModel() {
        JSONObject jsonBody = new JSONObject();
        try {
            jsonBody.put("id", 2);
            jsonBody.put("title", "MacBook Pro 2022");
            jsonBody.put("price", 1999.99);
            jsonBody.put("description", "The ultimate professional laptop for power users and creative professionals. Experience blazing-fast performance and stunning graphics.");
            jsonBody.put("category", "electronics");
            jsonBody.put("image", "https://example.com/images/macbook_pro_2022.jpg");
            JSONObject rating = new JSONObject();
            rating.put("rate", 4.8);
            rating.put("count", 250);

            jsonBody.put("rating", rating);
            return jsonBody;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }
}
