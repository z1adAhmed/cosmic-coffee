package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_in extends AppCompatActivity {
    private Button sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        sign_in = (Button) findViewById(R.id.sign_in2);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {main_menu();}
        });
    }
    public  void main_menu(){
        Intent intent = new Intent(this, main_menu.class);
        startActivity(intent);
    }
}