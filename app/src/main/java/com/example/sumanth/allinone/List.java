package com.example.sumanth.allinone;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class List extends AppCompatActivity {
    Button call,sms,mail,camera,upload,online,whatsapp;
    DrawerLayout draLayout;
    NavigationView navview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       draLayout =(DrawerLayout)findViewById(R.id.dlayout);
       navview=(NavigationView) findViewById(R.id.navviewid);

       navview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               int id = menuItem.getItemId();
               switch (id) {
                   case R.id.first:
                       Intent ca = new Intent(getApplicationContext(),CallscreenActivity.class);
                       startActivity(ca);
                       break;
                   case R.id.second:
                       Intent sm = new Intent(getApplicationContext(),SmsscreenActivity.class);
                       startActivity(sm);
                       break;
                   case R.id.third:
                       Intent ma = new Intent(getApplicationContext(),Mailscreen.class);
                       startActivity(ma);
                       break;
                   case R.id.fourth:
                       Intent cam = new Intent(getApplicationContext(),Camerascreen.class);
                       startActivity(cam);
                       break;
                   case R.id.fifth:
                       Intent up = new Intent(getApplicationContext(),Uploadscreen.class);
                       startActivity(up);
                       break;
                   case R.id.sitesmenu:
                       Intent ssm = new Intent(getApplicationContext(),MainActivity.class);
                       startActivity(ssm);
                       break;
                   case R.id.smedia:
                       Intent sma= new Intent(getApplicationContext(),Socialmedia.class);
                       startActivity(sma);
                   case R.id.report:
                       Intent rep= new Intent(getApplicationContext(),Reportapp.class);
                       startActivity(rep);

                       }

               menuItem.setChecked(true);
               draLayout.closeDrawers();
               return false;
           }
       });


        call=(Button)findViewById(R.id.but1);
        sms=(Button)findViewById(R.id.but2);
        mail=(Button)findViewById(R.id.but3);
        camera=(Button)findViewById(R.id.but4);
        upload=(Button)findViewById(R.id.but5);
        online=(Button)findViewById(R.id.but6);
        whatsapp=(Button) findViewById(R.id.but7);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca=new Intent(getApplicationContext
                        (),CallscreenActivity.class);
                startActivity(ca);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sm=new Intent(getApplicationContext
                        (),SmsscreenActivity.class);
                startActivity(sm);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma=new Intent(getApplicationContext
                        (),Mailscreen.class);
                startActivity(ma);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cam=new Intent(getApplicationContext
                        (),Camerascreen.class);
                startActivity(cam);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent up=new Intent(getApplicationContext
                        (),Uploadscreen.class);
                startActivity(up);
            }
        });

        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent on=new Intent(getApplicationContext
                        (),MainActivity.class);
                startActivity(on);
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent sme= new Intent(getApplicationContext(),Socialmedia.class);
               startActivity(sme);
            }
        });

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(List.this);
        builder.setTitle("Exit");
        builder.setIcon(R.drawable.exit);
        builder.setMessage("Do you want to Exit")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
