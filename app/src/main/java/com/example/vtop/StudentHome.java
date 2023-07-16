package com.example.vtop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentHome extends AppCompatActivity {

    TextView textmyinfo;
    ImageView imagemyinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        textmyinfo=findViewById(R.id.textmyinfo);
        imagemyinfo=findViewById(R.id.imagemyinfo);
        textmyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), MyInfo.class);
                startActivity(i);
            }
        });
    }
}