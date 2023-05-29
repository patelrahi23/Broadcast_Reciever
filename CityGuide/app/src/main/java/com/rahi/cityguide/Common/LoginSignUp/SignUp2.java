package com.rahi.cityguide.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahi.cityguide.R;

public class SignUp2 extends AppCompatActivity {

    ImageView backbtn;
    TextView titletext;
    Button next,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up2);
        backbtn = findViewById(R.id.signup_back_button);
        titletext = findViewById(R.id.signup_title_text);
        next = findViewById(R.id.signup_next_btn);
        login = findViewById(R.id.signup_login_btn);
    }

    public void callNextSignUpScreen(View view) {
        Intent intent = new Intent(getApplicationContext(),SignUp3.class);
        Pair[] pair = new Pair[4];
        pair[0] =new Pair<View,String>(backbtn,"transition_back_arrow_btn");
        pair[1] =new Pair<View,String>(titletext,"transition_title_text");
        pair[2] =new Pair<View,String>(next,"transition_next_btn");
        pair[3] =new Pair<View,String>(login,"transition_login_btn");
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(SignUp2.this,pair);
        startActivity(intent,activityOptions.toBundle());
    }

    public void callLoginScreen(View view) {
    }
}