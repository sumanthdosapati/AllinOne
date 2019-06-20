package com.example.sumanth.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
    }


    public void cnfbutton(View v){
        Intent n=new Intent(getApplicationContext(),CardActivity.class);
        startActivity(n);
    }
}
