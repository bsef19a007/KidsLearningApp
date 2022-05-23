package com.bsef19a007.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements override {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button_1 = findViewById(R.id.one_button);
        Button button_2 = findViewById(R.id.two_button);
        Button button_3 = findViewById(R.id.three_button);
        Button button_4 = findViewById(R.id.four_button);
        Button button_5 = findViewById(R.id.five_button);
        Button button_6 = findViewById(R.id.six_button);
        Button button_7 = findViewById(R.id.seven_button);
        Button button_8 = findViewById(R.id.eight_button);
        Button button_9 = findViewById(R.id.nine_button);
        Button button_10 = findViewById(R.id.ten_button);
        button_1.setOnClickListener((View.OnClickListener) this);
        button_2.setOnClickListener((View.OnClickListener) this);
        button_3.setOnClickListener((View.OnClickListener) this);
        button_4.setOnClickListener((View.OnClickListener) this);
        button_5.setOnClickListener((View.OnClickListener) this);
        button_6.setOnClickListener((View.OnClickListener) this);
        button_7.setOnClickListener((View.OnClickListener) this);
        button_8.setOnClickListener((View.OnClickListener) this);
        button_9.setOnClickListener((View.OnClickListener) this);
        button_10.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one_button:
                Intent intent1 = new Intent(this, One_Activity.class);
                startActivity(intent1);
                break;
            case R.id.two_button:
                Intent intent2 = new Intent(this, Two_Activity.class);
                startActivity(intent2);
                break;
            case R.id.three_button:
                Intent intent3 = new Intent(this, Three_Activity.class);
                startActivity(intent3);
                break;
            case R.id.four_button:
                Intent intent4 = new Intent(this, Four_Activity.class);
                startActivity(intent4);
                break;
            case R.id.five_button:
                Intent intent5 = new Intent(this, Five_Activity.class);
                startActivity(intent5);
                break;
            case R.id.six_button:
                Intent intent6 = new Intent(this, Six_Activity.class);
                startActivity(intent6);
                break;
            case R.id.seven_button:
                Intent intent7 = new Intent(this, Seven_Activity.class);
                startActivity(intent7);
                break;
            case R.id.eight_button:
                Intent intent8 = new Intent(this, Eight_Activity.class);
                startActivity(intent8);
                break;
            case R.id.nine_button:
                Intent intent9 = new Intent(this, Nine_Activity.class);
                startActivity(intent9);
                break;
            case R.id.ten_button:
                Intent intent10 = new Intent(this, Ten_Activity.class);
                startActivity(intent10);
                break;
            default:
                break;
        }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        setContentView(R.layout.activity_main2);
//        Button button_1 = findViewById(R.id.one_button);
//        button_1.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, One_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_2 = findViewById(R.id.two_button);
//        button_2.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Two_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_3 = findViewById(R.id.three_button);
//        button_3.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Three_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_4 = findViewById(R.id.four_button);
//        button_4.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Four_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_5 = findViewById(R.id.five_button);
//        button_5.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Five_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_6 = findViewById(R.id.six_button);
//        button_6.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Six_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_7 = findViewById(R.id.seven_button);
//        button_7.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Seven_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_8 = findViewById(R.id.eight_button);
//        button_8.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Eight_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_9 = findViewById(R.id.nine_button);
//        button_9.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Nine_Activity.class)));
//
//        setContentView(R.layout.activity_main2);
//        Button button_10 = findViewById(R.id.ten_button);
//        button_10.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Ten_Activity.class)));
//    }
    }
}
