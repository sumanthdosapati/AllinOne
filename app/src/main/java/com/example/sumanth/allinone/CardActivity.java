package com.example.sumanth.allinone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        b1 = (Button) findViewById(R.id.clibutton);
        ed1 = (EditText) findViewById(R.id.useredit);
        ed2 = (EditText) findViewById(R.id.passedit);
        t1 = (TextView) findViewById(R.id.forpass);
        t2 = (TextView) findViewById(R.id.register);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forg = new Intent(getApplicationContext(), ForgotActivity.class);
                startActivity(forg);
            }

        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(reg);
            }

        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Login Successful :)", Toast.LENGTH_SHORT).show();
                    Intent n = new Intent(getApplicationContext(),List.class);
                    startActivity(n);



                } else
                     if (ed1.getText().toString().equals("") |
                        ed2.getText().toString().equals("")) {
                         Toast.makeText(getApplicationContext(),
                                 "Username or Password cannot be empty !", Toast.LENGTH_SHORT).show();
                     }
                     else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials !", Toast.LENGTH_SHORT).show();
                }



                }




        });
    }}
