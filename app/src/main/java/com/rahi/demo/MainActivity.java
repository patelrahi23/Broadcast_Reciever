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

    Button b1;
    int s1;
    EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btn_show);

        et1=findViewById(R.id.et_name);



       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            String s = et1.getText().toString();
            int n1 = Integer.parseInt(s);

            Intent i = new Intent(MainActivity.this,Number2.class);
            i.putExtra("Number1",n1);
            startActivity(i);

           }
       });


    }
}
