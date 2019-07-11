package com.rahi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intent_Transaction extends AppCompatActivity {

    Button b;
    EditText et_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent__transaction);

        b=findViewById(R.id.btn);
        et_name=findViewById(R.id.etname);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name=et_name.getText().toString();
                Intent i = new Intent(Intent_Transaction.this,Intent_Transaction1.class);
                i.putExtra("myname",name);
                startActivity(i);
                finish();


            }
        });

    }
}
