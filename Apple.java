package com.example.alensh.intent;

import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, Banana.class);
        //Method to start the banana class
        final EditText userMessage = (EditText)findViewById(R.id.userMessage);
        String userText = userMessage.getText().toString();
        i.putExtra("AMessage",userText);

        startActivity(i);
    }


}