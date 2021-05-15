package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

    }

    public void setDescription(View view) {
        int position = spinner.getSelectedItemPosition();
        setDescription(position);
    }
    public void setDescription(int position){
        String[] colorsDescriptions = getResources().getStringArray(R.array.colorsDescription);
        textView.setText(colorsDescriptions[position]);
    }
}