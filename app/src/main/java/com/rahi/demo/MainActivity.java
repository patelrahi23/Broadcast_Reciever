package com.rahi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    TextView tv1;
    EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2=findViewById(R.id.btn_calc);
        b1=findViewById(R.id.btn_show);
        tv1=findViewById(R.id.tv_val);
        et1=findViewById(R.id.et_name);
        et2=findViewById(R.id.et_number);


       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {
                   int s1 = Integer.parseInt(et1.getText().toString());
                   int s2 = Integer.parseInt(et2.getText().toString());
                   int sum=s1+s2;
                   tv1.setText("answer is :"+sum);
                   Toast.makeText(getApplicationContext(),"ans:"+sum,Toast.LENGTH_LONG).show();


               } catch (Exception e) {
                   e.printStackTrace();
                   tv1.setText("enter a number");
                   Toast.makeText(getApplicationContext(),"enter a number",Toast.LENGTH_LONG).show();
               }
           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(MainActivity.this,Calculator.class);
                startActivity(i);
                finish();
            }
        });

    }
}
