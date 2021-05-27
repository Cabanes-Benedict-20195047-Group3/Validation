package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void btnFnction(View view) {
        String uName = username.getText().toString();
        String pWord = password.getText().toString();



        if (uName.equals("Benedict") && pWord.equals("20195047"))
        {
            Intent intent = new Intent(MainActivity.this, user1_Ben.class);
            startActivity(intent);
        }
        else if (uName.equals("Mary Anne") && pWord.equals("20191062"))
        {
            Intent intent = new Intent(MainActivity.this, user2_maryanne.class);
            startActivity(intent);
        }
        else if (uName.equals("Aldiguer") && pWord.equals("20191415"))
        {
            Intent intent = new Intent(MainActivity.this, user3_aldi.class);
            startActivity(intent);
        }
        else if (uName.equals("Mark Joseph") && pWord.equals("20183902"))
        {
            Intent intent = new Intent(MainActivity.this, user4_mark.class);
            startActivity(intent);
        }
    }
}