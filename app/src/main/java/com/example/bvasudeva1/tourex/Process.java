package com.example.bvasudeva1.tourex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Process extends AppCompatActivity {


    // Get a reference to our posts
    ArrayList<String> services = new ArrayList<String>();
    ArrayList<Integer> qos = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

        Intent intent=getIntent();

        services = intent.getStringArrayListExtra("services");
        qos = intent.getIntegerArrayListExtra("qos");

    }

    public void readFromServer(String serviceType){

    }

    public String getServiceType(String service){

        switch(service){
            case "0": return "cab";
            case "1" : return"clothing";
            case "2" : return"jewellery";
            case "3" : return"lodge";
            case "4" : return"restaurant";
            case "5" : return"shopping";
            case "6" : return"sites";
            case "7" : return"travel";
            default: return "";
        }
    }
}
