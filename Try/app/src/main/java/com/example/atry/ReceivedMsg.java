package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMsg extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_msg);
        textView = findViewById(R.id.textViewReceived);
        Intent ReceivedIntent = getIntent();
        String msg =  ReceivedIntent.getStringExtra("msg");
        textView.setText(msg);
    }
}