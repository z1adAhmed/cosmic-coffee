package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_menu extends AppCompatActivity {
    private Button action1;
    private Button action2;
    private Button action3;
    private Button action4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        action1 = (Button) findViewById(R.id.action1);
        action1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cappuccino();
            }
        });
        action2 = (Button) findViewById(R.id.action3);
        action2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mocha();}
        });
        action3 = (Button) findViewById(R.id.action2);
        action3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {latte();}
        });
        action4 = (Button) findViewById(R.id.action4);
        action4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {espresso();}
        });


    }
    public  void cappuccino(){
        Intent intent = new Intent(this, cappuccino.class);
        startActivity(intent);
    }
    public  void mocha(){
        Intent intent = new Intent(this, mocha.class);
        startActivity(intent);
    }
    public  void latte(){
        Intent intent = new Intent(this, latte.class);
        startActivity(intent);
    }
    public  void espresso(){
        Intent intent = new Intent(this, espresso.class);
        startActivity(intent);
    }


}