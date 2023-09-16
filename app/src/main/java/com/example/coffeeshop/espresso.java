package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class espresso extends AppCompatActivity {
    private Button purchase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
        purchase = (Button) findViewById(R.id.purchase4);
        purchase.setOnClickListener(new View.OnClickListener() {
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