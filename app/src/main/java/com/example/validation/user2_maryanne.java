package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user2_maryanne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2_maryanne);
    }

    public void btnlogOut(View view) {
        Intent intent = new Intent(user2_maryanne.this, MainActivity.class);
        startActivity(intent);
    }
}