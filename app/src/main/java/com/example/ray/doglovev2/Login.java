package com.example.ray.doglovev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
        public void sendMessage(View view) {
            switch (view.getId()) {
                case R.id.bLogin:
                    Intent menuIntent = new Intent(Login.this, MenuDog.class);
                    startActivity(menuIntent);
                    break;
                case R.id.tvRegisterLink:
                    Intent registerIntent = new Intent(Login.this, Register.class);
                    startActivity(registerIntent);
                    break;
            }
        }

}