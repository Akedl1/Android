package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMsg extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_msg);
        textView = findViewById(R.id.textReceivedMsg);
        Intent intent = getIntent();
        String message =  intent.getStringExtra("msg");
        textView.setText(message);
    }
}