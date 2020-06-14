package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent intent = new Intent(Activity2.this,Activity4.class);
                startActivity(intent);

                break;
            case R.id.button5:
                intent = new Intent(Activity2.this,Activity5.class);
                startActivity(intent);

                break;
    }
}}