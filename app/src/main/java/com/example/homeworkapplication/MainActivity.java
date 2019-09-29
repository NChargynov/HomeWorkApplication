package com.example.homeworkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                textView = findViewById(R.id.dark);
                textView.setBackgroundColor(Color.GREEN);
                textView = findViewById(R.id.time2);
                textView.setTextColor(Color.YELLOW);
                textView = findViewById(R.id.time3);
                textView.setTextColor(Color.YELLOW);
                textView = findViewById(R.id.bosrding_time);
                textView.setTextColor(Color.YELLOW);
                textView = findViewById(R.id.remainig);
                textView.setTextColor(Color.YELLOW);
            }


        });


        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                textView = findViewById(R.id.yellow);
                textView.setBackgroundColor(Color.BLUE);
                textView = findViewById(R.id.a5);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.a24);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.a34);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.Ac182);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.fli);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.gate);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.group);
                textView.setTextColor(Color.GRAY);
                textView = findViewById(R.id.seat);
                textView.setTextColor(Color.GRAY);
            }
        });

        Button button3 = findViewById(R.id.businnes);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("BISH");
                button2.setText("ALM");
            }
        });
    }


}