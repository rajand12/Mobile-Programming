package app.mobile.recyclerviewclasswork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;  // create a recycler view item

    LinearLayoutManager linearLayoutManager; //create a layout manager object

    DistrictRecyclerAdapter districtRecyclerAdapter; //adapter object

    ArrayList<DistrictItem> dataArrayList = new ArrayList<>(); //data array object


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);

        createDataArray();

        //initialize recyclerview
        myRecyclerView = findViewById(R.id.recycler);
        //linear layout manager
        linearLayoutManager = new LinearLayoutManager(this);
        //set layout manager to recycler
        myRecyclerView.setLayoutManager(linearLayoutManager);
        //initial adapter
        districtRecyclerAdapter = new DistrictRecyclerAdapter(this,dataArrayList);
        //set adapter
        myRecyclerView.setAdapter(districtRecyclerAdapter);
    }
    void createDataArray(){
        dataArrayList.add(new DistrictItem("Nawalparasi", 643508, 27.9, 216.9));
        dataArrayList.add(new DistrictItem("Ilam", 290254, 21.6, 1703.5));
        dataArrayList.add(new DistrictItem("Kaski", 492098, 22.5, 2015.5));
        dataArrayList.add(new DistrictItem("Dang", 553481, 26.1, 2819.5));
        dataArrayList.add(new DistrictItem("Kailali", 775709, 27.4, 3184.4));
        dataArrayList.add(new DistrictItem("Baitadi", 250898, 23.7, 1521.0));
        dataArrayList.add(new DistrictItem("Dhankuta", 163412, 20.8, 891.5));
        dataArrayList.add(new DistrictItem("Jumla", 108921, 16.9, 2534.0));
        dataArrayList.add(new DistrictItem("Sankhuwasabha", 159203, 19.4, 3483.0));
        dataArrayList.add(new DistrictItem("Taplejung", 127461, 18.3, 3646.0));
        dataArrayList.add(new DistrictItem("Gorkha", 271061, 22.5, 3610.2));
        dataArrayList.add(new DistrictItem("Baglung", 289148, 19.5, 1785.5));
        dataArrayList.add(new DistrictItem("Syangja", 289148, 21.1, 395.6));
        dataArrayList.add(new DistrictItem("Rupandehi", 880196, 26.8, 1360.0));
        dataArrayList.add(new DistrictItem("Palpa", 261180, 23.8, 1373.0));
        dataArrayList.add(new DistrictItem("Salyan", 261180, 25.5, 1460.0));
        dataArrayList.add(new DistrictItem("Dolakha", 204229, 18.4, 2191.0));
        dataArrayList.add(new DistrictItem("Makwanpur", 420477, 26.2, 2427.0));
        dataArrayList.add(new DistrictItem("Okhaldhunga", 147984, 18.8, 1079.0));
        dataArrayList.add(new DistrictItem("Udayapur", 317532, 25.7, 2064.0));
        dataArrayList.add(new DistrictItem("Tanahu", 315237, 22.7, 1548.6));
        dataArrayList.add(new DistrictItem("Parbat", 157826, 20.5, 494.0));
        dataArrayList.add(new DistrictItem("Kanchanpur", 451248, 26.8, 6156.0));
        dataArrayList.add(new DistrictItem("Bajura", 133408, 16.2, 2415.0));
        dataArrayList.add(new DistrictItem("Bajhang", 195159, 21.1, 3427.0));
        dataArrayList.add(new DistrictItem("Humla", 50, 7.4, 5693.0));
        dataArrayList.add(new DistrictItem("Kapilvastu", 571936, 26.4, 1738.0));
        dataArrayList.add(new DistrictItem("Saptari", 639284, 27.5, 1362.0));
        dataArrayList.add(new DistrictItem("Siraha", 637328, 27.7, 1183.0));
        dataArrayList.add(new DistrictItem("Dhanusha", 754777, 27.1, 1185.0));
        dataArrayList.add(new DistrictItem("Mahottari", 627580, 27.8, 1016.0));
        dataArrayList.add(new DistrictItem("Rautahat", 686722, 27.5, 1122.0));
        dataArrayList.add(new DistrictItem("Bara", 687708, 28.0, 1197.0));
        dataArrayList.add(new DistrictItem("Parsa", 601017, 27.6, 1368.0));
        dataArrayList.add(new DistrictItem("Kavrepalanchok", 385672, 21.8, 1397.0));
        dataArrayList.add(new DistrictItem("Lalitpur", 337785, 23.2, 385.0));
        dataArrayList.add(new DistrictItem("Bhaktapur", 304651, 22.8, 119.0));
        dataArrayList.add(new DistrictItem("Sindhuli", 296192, 25.0, 2491.0));
        dataArrayList.add(new DistrictItem("Nuwakot", 277471, 21.8, 1121.0));
        dataArrayList.add(new DistrictItem("Sindhupalchok", 296192, 19.7, 2541.0));
    }
}