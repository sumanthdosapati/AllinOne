package com.example.sumanth.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mailscreen extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button b1;
    String to,subject,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailscreen);


            ed1=(EditText)findViewById(R.id.toemail);
            ed2=(EditText)findViewById(R.id.subject);
            ed3=(EditText)findViewById(R.id.message);

            b1=(Button)findViewById(R.id.send);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    to=ed1.getText().toString();
                    subject=ed2.getText().toString();
                    message=ed3.getText().toString();

                    Intent n=new Intent(Intent.ACTION_SEND);

                    n.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                    n.putExtra(Intent.EXTRA_SUBJECT,subject);
                    n.putExtra(Intent.EXTRA_TEXT,message);

                    n.setType("message/rfc822");

                    startActivity(Intent.createChooser(n,"Select Gmail:"));

                }
            });

        }
}
