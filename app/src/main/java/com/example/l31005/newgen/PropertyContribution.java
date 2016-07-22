package com.example.l31005.newgen;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PropertyContribution extends AppCompatActivity {

    EditText cashonhand1;
    EditText cpfval1;
    TextView affordable;
    Button checkBtn;

    Button findProperty;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_contribution);


        cashonhand1 = (EditText) findViewById(R.id.cashonhand);
        cpfval1 = (EditText) findViewById(R.id.cpfval);
        checkBtn = (Button) findViewById(R.id.checkBtn);
        affordable = (TextView) findViewById(R.id.txtAffordable);


        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double newValue = Double.parseDouble(cashonhand1.getText().toString());
                double cpfVal = Double.parseDouble(cpfval1.getText().toString());

                double cash =  calculateAffordtableHousingLoan(newValue, cpfVal);

                DecimalFormat form = new DecimalFormat("0");
                affordable.setText(form.format(cash));

            }
        });

        // go to finding property
        findProperty = (Button) findViewById(R.id.btnFindProperties);

        findProperty.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent ii = new Intent(PropertyContribution.this, SearchResult.class);
                startActivity(ii);
            }

        });

    }

    public void AlertDialog(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(PropertyContribution.this);
        builder1.setTitle("Invalid Input");
        builder1.setNegativeButton("OK", null);
    }

    private double calculateAffordtableHousingLoan(double cashOnHand, double cpfMonies){

        double total = cashOnHand + cpfMonies;

        double rate = 0.2275;

        return total / rate;

    }

}
