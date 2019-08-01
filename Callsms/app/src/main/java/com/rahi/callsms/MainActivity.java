package com.rahi.callsms;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    RelativeLayout relsms, relcall;
    EditText etphone, etsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etphone = findViewById(R.id.etphone);
        etsms = findViewById(R.id.etsms);
        relcall = findViewById(R.id.relcall);
        relsms = findViewById(R.id.relsms);


        relcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etphone.getText().toString().isEmpty()) {
                    etphone.setError("Please enter number");
                } else {
                    makeCall(etphone.getText().toString());
                }

            }
        });
        relsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (etphone.getText().toString().isEmpty()) {
                    etphone.setError("Please enter number");
                }
                else if(etsms.getText().toString().trim().isEmpty())
                {
                    etsms.setError("Please enter msg");
                }
                else {
                    sendMsg(etphone.getText().toString(),etsms.getText().toString());
                }

            }
        });
    }


    void makeCall(String number) {
        String callstring = "tel:" + number;
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse(callstring));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(getApplicationContext(),"Give Permission..",Toast.LENGTH_LONG).show();

            return;
        }
        startActivity(i);


    }


    void sendMsg(String number,String sms)
    {


        try {

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(getApplicationContext(),"Give Permission..",Toast.LENGTH_LONG).show();

                return;
            }

            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number, null, sms, null, null);
            Toast.makeText(getApplicationContext(),"send",Toast.LENGTH_LONG).show();

        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Try again",Toast.LENGTH_LONG).show();
        }


    }





}
