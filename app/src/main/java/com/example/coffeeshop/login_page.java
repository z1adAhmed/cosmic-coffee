package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_page extends AppCompatActivity {
    private Button log_in;
    private  Button sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        log_in = (Button) findViewById(R.id.log_in);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_menu();
            }
        });
        sign_in = (Button) findViewById(R.id.sign_in);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Sign_in();}
        });
    }
    public  void main_menu(){
        Intent intent = new Intent(this, main_menu.class);
        startActivity(intent);
    }
    public  void Sign_in(){
        Intent intent = new Intent(this, Sign_in.class);
        startActivity(intent);
    }
}