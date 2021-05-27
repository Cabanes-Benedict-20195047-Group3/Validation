package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user3_aldi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user3_aldi);
    }
    public void btnlogOut(View view) {
        Intent intent = new Intent(user3_aldi.this, MainActivity.class);
        startActivity(intent);
    }
}