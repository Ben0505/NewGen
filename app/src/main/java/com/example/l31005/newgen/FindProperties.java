package com.example.l31005.newgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Property;

import java.util.ArrayList;
import java.util.List;

import model.Properties;

public class FindProperties extends AppCompatActivity {

    List propertiesList = new ArrayList<Properties>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_properties);
    }

    private void populateData(){
        Properties p = new Properties("Punggol", "2-Room", 139000);
        Properties p1 = new Properties("Punggol", "3-Room", 212000);
        Properties p2 = new Properties("Punggol", "4-Room", 341000);
        Properties p3 = new Properties("Punggol", "5-Room", 429000);
        Properties p4 = new Properties("Sengkang", "2-Room", 135000);
        Properties p5 = new Properties("Sengkang", "3-Room", 208000);
        Properties p6 = new Properties("Sengkang", "4-Room", 335000);

        propertiesList.add(p);
        propertiesList.add(p1);
        propertiesList.add(p2);
        propertiesList.add(p3);
        propertiesList.add(p4);
        propertiesList.add(p5);
        propertiesList.add(p6);

    }

    /*private void filterData(double price){
        for(Property p : propertiesList){
            if(p)
        }
    }*/
}
