package com.example.sumanth.allinone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }



    public void swibutton(View v){
        webView = (WebView) findViewById(R.id.wview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.swiggy.com");

    }

    public void zombutton(View v){
        Intent z=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com"));
        startActivity(z);
    }

    public void ubebutton(View v){
        Intent u=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ubereats.com"));
        startActivity(u);
    }

    public void foobutton(View v){
        Intent f=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.in"));
        startActivity(f);
    }




    public void flibutton(View v){
        Intent fl=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com"));
        startActivity(fl);
    }

    public void amabutton(View v){
        Intent am=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in"));
        startActivity(am);
    }

    public void snabutton(View v){
        Intent sn=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.snapdeal.com"));
        startActivity(sn);
    }

    public void mynbutton(View v){
        Intent my=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com"));
        startActivity(my);
    }





    public void bmsbutton(View v){
        Intent bm=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bookmyshow.com"));
        startActivity(bm);
    }

    public void jusbutton(View v){
        Intent ju=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.justickets.in"));
        startActivity(ju);
    }

    public void ticbutton(View v){
        Intent ti=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ticketnew.com"));
        startActivity(ti);
    }






    public void abhbutton(View v){
        Intent ab=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.abhibus.com"));
        startActivity(ab);
    }

    public void redbutton(View v){
        Intent re=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.redbus.com"));
        startActivity(re);
    }

    public void paybutton(View v){
        Intent pa=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paytm.com"));
        startActivity(pa);
    }

}
