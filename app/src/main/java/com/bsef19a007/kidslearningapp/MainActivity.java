package com.bsef19a007.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Quiz_Activity.class)));
    }
}