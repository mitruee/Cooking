package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonRussianKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RussianActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonItalianKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ItalianActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonFrenchKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrenchActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonTurkishKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TurkishActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonJapaneseKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JapaneseActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonTaiKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TaiActivity.class));
                finish();
            }
        });

        findViewById(R.id.buttonIndianKitchen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IndianActivity.class));
                finish();
            }
        });
    }
}