package com.demo.cafeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {
    TextView textViewScrolling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        Intent intent = getIntent();
        String order = intent.getStringExtra("order");
        textViewScrolling = findViewById(R.id.textViewScrolling);
        textViewScrolling.setText(order);
    }
}