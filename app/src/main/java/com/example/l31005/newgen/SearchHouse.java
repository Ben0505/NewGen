package com.example.l31005.newgen;


import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)

public class SearchHouse extends Fragment {

    View myView1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView1 = inflater.inflate(R.layout.activity_search_house, container, false);

        Button toResult = (Button) myView1.findViewById(R.id.submitSearch);
        toResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it1 = new Intent(getActivity(),SearchResult.class);
                startActivity(it1);

            }
        });


        return myView1;

    }
}
