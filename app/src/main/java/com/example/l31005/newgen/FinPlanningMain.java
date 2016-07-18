package com.example.l31005.newgen;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)

public class FinPlanningMain extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.activity_finplanning_main, container, false);

        Button b1 = (Button) myView.findViewById(R.id.submitFinPlanButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(getActivity(), FinPlanGrant.class);
                startActivity(i2);

            }
        });

        return myView;
    }

}
