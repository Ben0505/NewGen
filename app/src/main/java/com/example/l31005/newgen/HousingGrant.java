package com.example.l31005.newgen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HousingGrant extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_grant);

        webView = (WebView) findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.hdb.gov.sg/cs/infoweb/residential/buying-a-flat/new/cpf-housing-grants-for-hdb-flats&rendermode=preview");

    }
}
