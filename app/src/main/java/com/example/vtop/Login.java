package com.example.vtop;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText regnum,password;
    AppCompatButton loginbutton;
    TextView forgotpassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regnum=findViewById(R.id.input_regnum);
        password=findViewById(R.id.input_password);
        loginbutton=findViewById(R.id.loginbutton);
        forgotpassword=findViewById(R.id.forgotpassword);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), StudentHome.class);
                startActivity(i);
            }
        });

    }
}