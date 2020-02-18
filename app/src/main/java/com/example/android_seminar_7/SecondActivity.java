package com.example.android_seminar_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String current = "";

        current = getIntent().getExtras().getString("suntagi" , "").toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(current);
    }
}
