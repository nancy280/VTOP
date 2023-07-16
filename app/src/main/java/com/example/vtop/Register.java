package com.example.vtop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText name,regnum,password,email,cpassword;
    AppCompatButton registerbutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name=findViewById(R.id.input_name);
        regnum=findViewById(R.id.input_Regnum);
        password=findViewById(R.id.input_password);
        email=findViewById(R.id.input_email);
        cpassword=findViewById(R.id.input_CPassword);
        registerbutton=findViewById(R.id.registerbutton);

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });

    }
}