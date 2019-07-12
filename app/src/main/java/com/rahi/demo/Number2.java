package com.rahi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Number2 extends AppCompatActivity {

    TextView tv1;
    Button b1;
    EditText et1;
    int n,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);

        tv1 = findViewById(R.id.tv_num1);
        b1 = findViewById(R.id.btn_next);
        et1 = findViewById(R.id.et_num2);
        Intent i = getIntent();

         s = i.getIntExtra("Number1",0);
        tv1.setText("ans:"+s);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = Integer.parseInt(et1.getText().toString());
                int sum = n+s;

                Intent intent = new Intent(Number2.this,Sum.class);
                intent.putExtra("Number2",sum);
                startActivity(intent);
                finish();

            }
        });




    }
}
