package com.rahi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent_Transaction1 extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent__transaction1);

        tv1=findViewById(R.id.tv);

        Intent intent = getIntent();

        String name = intent.getStringExtra("myname");
        tv1.setText(name);
    }
}
