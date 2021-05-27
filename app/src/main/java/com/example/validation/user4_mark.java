package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user4_mark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user4_mark);
    }
    public void btnlogOut(View view) {
        Intent intent = new Intent(user4_mark.this, MainActivity.class);
        startActivity(intent);
    }
}