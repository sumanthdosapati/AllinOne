package com.example.sumanth.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Socialmedia extends AppCompatActivity {

    ImageView wh,fa,in,yo,sn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialmedia);

        wh=(ImageView)findViewById(R.id.whatsapp);
        fa=(ImageView)findViewById(R.id.facebook);
        in=(ImageView)findViewById(R.id.instagram);
        yo=(ImageView)findViewById(R.id.youtube);
        sn=(ImageView)findViewById(R.id.snapchat);


        wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wh= getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                if(wh!=null){
                    startActivity(wh);}
                else {
                    Toast.makeText(getApplicationContext(),"Whatsapp is not installed !",Toast.LENGTH_LONG).show();
                }
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa= getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                if(fa!=null){
                    startActivity(fa);}
                else {
                    Toast.makeText(getApplicationContext(),"Facebook is not installed !",Toast.LENGTH_LONG).show();
                }
            }
        });

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                if(in!=null){
                    startActivity(in);}
                else {
                    Toast.makeText(getApplicationContext(),"Instagram is not installed !",Toast.LENGTH_LONG).show();
                }
            }
        });

        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yo= getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                if(yo!=null){
                    startActivity(yo);}
                else {
                    Toast.makeText(getApplicationContext(),"Youtube is not installed !",Toast.LENGTH_LONG).show();
                }
            }
        });

        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sn= getPackageManager().getLaunchIntentForPackage("com.snapchat.android");
                if(sn!=null){
                    startActivity(sn);}
                else {
                    Toast.makeText(getApplicationContext(),"Snapchat is not installed !",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
