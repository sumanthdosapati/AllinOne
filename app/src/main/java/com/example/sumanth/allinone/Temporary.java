package com.example.sumanth.allinone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Temporary extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary);

    }
    public void smile(View v){
        Intent sm=new Intent(getApplicationContext(),List.class);
        startActivity(sm);
    }


}
