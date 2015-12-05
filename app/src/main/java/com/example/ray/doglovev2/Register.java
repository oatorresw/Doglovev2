package com.example.ray.doglovev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registrar(View view) {
        switch (view.getId()) {
            case R.id.bRegister:
                Intent intent = new Intent(Register.this,MenuDog.class);
                startActivity(intent);
                break;

        }
    }
}
