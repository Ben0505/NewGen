package com.example.l31005.newgen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by L31005 on 7/5/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments1 = new ArrayList<>();
    ArrayList<String> tabTitles1 = new ArrayList<>();

    public void addFragments (Fragment fragments, String titles){
        this.fragments1.add(fragments);
        this.tabTitles1.add(titles);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments1.get(position);
    }

    @Override
    public int getCount() {
        return fragments1.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles1.get(position);
    }

}
