package com.bsef19a007.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);
        Button button_1 = findViewById(R.id.one_button);
        button_1.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, One_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_2 = findViewById(R.id.two_button);
        button_2.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Two_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_3 = findViewById(R.id.three_button);
        button_3.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Three_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_4 = findViewById(R.id.four_button);
        button_4.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Four_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_5 = findViewById(R.id.five_button);
        button_5.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Five_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_6 = findViewById(R.id.six_button);
        button_6.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Six_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_7 = findViewById(R.id.seven_button);
        button_7.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Seven_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_8 = findViewById(R.id.eight_button);
        button_8.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Eight_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_9 = findViewById(R.id.nine_button);
        button_9.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Nine_Activity.class)));

        setContentView(R.layout.activity_main2);
        Button button_10 = findViewById(R.id.ten_button);
        button_10.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Ten_Activity.class)));
    }
}
