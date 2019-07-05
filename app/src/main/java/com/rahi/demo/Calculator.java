package com.rahi.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;
    EditText edt1,edt2;
    TextView txt1;
    double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn1=findViewById(R.id.btn_add);
        btn2=findViewById(R.id.btn_sub);
        btn3=findViewById(R.id.btn_mul);
        btn4=findViewById(R.id.btn_div);
        btn5=findViewById(R.id.btn_qual);
        edt1=findViewById(R.id.et_number1);
        edt2=findViewById(R.id.et_number2);
        txt1=findViewById(R.id.tv_calc);

        if (edt1.getText().toString().trim().equalsIgnoreCase("")) {
            edt1.setError("This field can not be blank");
        }


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int n1 = Integer.parseInt(edt1.getText().toString());
                    int n2 = Integer.parseInt(edt2.getText().toString());
                    int s = n1 + n2;
                    sum = s;


                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int n1 = Integer.parseInt(edt1.getText().toString());
                    int n2 = Integer.parseInt(edt2.getText().toString());
                    int s = n1 - n2;
                    sum = s;
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int n1 = Integer.parseInt(edt1.getText().toString());
                    int n2 = Integer.parseInt(edt2.getText().toString());
                    int s = n1 * n2;
                    sum = s;
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double n1 = Double.parseDouble(edt1.getText().toString());
                    double n2 = Double.parseDouble(edt2.getText().toString());
                    double s = n1 / n2;
                    sum = s;
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt1.setText(String.valueOf(sum));
                }
            });

    }
}
