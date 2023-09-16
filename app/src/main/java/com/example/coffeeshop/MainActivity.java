package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Get_started;
    private Button contact_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Get_started = (Button) findViewById(R.id.Get_started);
        Get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login_page();
            }
        });
        contact_us = (Button) findViewById(R.id.contact_us);
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contact_us();
            }
        });
    }
    public  void login_page(){
        Intent intent = new Intent(this, login_page.class);
        startActivity(intent);
    }
    public  void Contact_us(){
        Intent intent = new Intent(this, contact_us.class);
        startActivity(intent);
    }
}