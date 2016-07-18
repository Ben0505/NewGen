package com.example.l31005.newgen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class PopUpLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popuplogin);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.8));

        Login_button();
        CreateAcc_btn();
        Cancel_button();

    }

    private void Login_button(){

        Button Login = (Button) findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PopUpLogin.this,NavigationActivity.class);
                startActivity(myIntent);
            }
        });

    }

    private void CreateAcc_btn(){

        Button makeAcc = (Button) findViewById(R.id.createAccBtn) ;

        makeAcc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(PopUpLogin.this,PopUpSignUp.class);
                startActivity(myIntent);
            }
        });

    }

    private void Cancel_button(){

        Button cancelLogin = (Button) findViewById(R.id.cancel);

        cancelLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }

}
