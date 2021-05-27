package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user1_Ben extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1_ben);
    }

    public void btnlogOut(View view) {
        Intent intent = new Intent(user1_Ben.this, MainActivity.class);
        startActivity(intent);
    }
}