package com.example.l31005.newgen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FinPlanGrant extends AppCompatActivity  {

    EditText cashonhand1;
    EditText cpfval;
    TextView affordable;
    Button findProperties;
    Double money;
    Button checkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finplan_grant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        cashonhand1 = (EditText) findViewById(R.id.cashonhand);
        cpfval = (EditText) findViewById(R.id.cpfval);
        checkBtn = (Button) findViewById(R.id.checkBtn);
        affordable = (TextView) findViewById(R.id.txtAffordable);

        findProperties = (Button) findViewById(R.id.btnFindProperties);

        findProperties.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double newValue = Double.parseDouble(cashonhand1.getText().toString());
                double cpfVal = Double.parseDouble(cpfval.getText().toString());

                double cash =  calculateAffordtableHousingLoan(newValue, cpfVal);

                DecimalFormat form = new DecimalFormat("0");
                affordable.setText(form.format(cash));
            }
        });



    }

    private double calculateAffordtableHousingLoan(double cashOnHand, double cpfMonies){

        double total = cashOnHand + cpfMonies;

        double rate = 0.2275;

        return total / rate;

    }



}
