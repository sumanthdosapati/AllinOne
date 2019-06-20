package com.example.sumanth.allinone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsscreenActivity extends AppCompatActivity {

    EditText phno,message;
    Button smsbtn;
    String phonenumbe,mesaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsscreen);

        Button smsbtn=(Button) findViewById(R.id.Btnsm);
        smsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText phno=(EditText)findViewById(R.id.phno);
                EditText message=(EditText)findViewById(R.id.message);
                String phonenumbe= phno.getText().toString();
                String mesaa= message.getText().toString();

                Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("smsto",phonenumbe, null));
                sendIntent.putExtra("sms_body", mesaa);
                startActivity(sendIntent);

            }
        });

    }
}
