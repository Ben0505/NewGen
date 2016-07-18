package com.example.l31005.newgen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SearchResult extends AppCompatActivity {

    Toolbar toolbar1;
    TabLayout tabLayout1;
    ViewPager viewPager1;
    ViewPagerAdapter viewPagerAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Toolbar toolbar00 = (Toolbar) findViewById(R.id.toolbar12);
        setSupportActionBar(toolbar00);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.setVisibility(FloatingActionButton.GONE);


        toolbar1 = (Toolbar) findViewById(R.id.toolBar1);
        setSupportActionBar(toolbar1);

        tabLayout1 = (TabLayout) findViewById(R.id.tabLayout1);
        viewPager1 = (ViewPager) findViewById(R.id.viewPager1);

        viewPagerAdapter1 = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter1.addFragments(new SearchList(), "LIST");
        viewPagerAdapter1.addFragments(new SearchMap(), "MAP");

        viewPager1.setAdapter(viewPagerAdapter1);
        tabLayout1.setupWithViewPager(viewPager1);

    }

}
