package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cappuccino extends AppCompatActivity {
    private Button purchase2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino);
        purchase2 = (Button) findViewById(R.id.purchase2);
        purchase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                purchase();
            }
        });
    }
    public  void purchase(){
        Intent intent = new Intent(this, purchase.class);
        startActivity(intent);
    }
}