package com.rahi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sum extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        tv1=findViewById(R.id.tv_sum);
        Intent intent = getIntent();

        int s = intent.getIntExtra("Number2",0);
        tv1.setText("ans:"+s);
    }
}
