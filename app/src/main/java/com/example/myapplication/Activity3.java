package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity  implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button button9 = findViewById(R.id.button9);
        Button button3 = findViewById(R.id.button3);
        button9.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button9:
                Intent intent = new Intent(Activity3.this,Activity6.class);
                startActivity(intent);

                break;
            case R.id.button3:
                intent = new Intent(Activity3.this,Activity7.class);
                startActivity(intent);

                break;
    }
}}
