package com.example.l31005.newgen;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HousePreview extends AppCompatActivity {

    ViewPager viewPager01;
    HsePreviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_preview);
        /*viewPager01 = (ViewPager) findViewById(R.id.previewPicSection);
        adapter = new HsePreviewAdapter(this);
        viewPager01.setAdapter(adapter);*/

    }
}
