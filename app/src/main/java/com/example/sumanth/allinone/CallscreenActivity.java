package com.example.sumanth.allinone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallscreenActivity extends AppCompatActivity {

    EditText editcal;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callscreen);

        Button button = (Button) findViewById(R.id.btncal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editcal=(EditText) findViewById(R.id.edit1);

                final String cal=editcal.getText().toString();
                dialContatPhone(cal);
            }
        });
    }

    private void dialContatPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}



