package com.knightcoder.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    private TextView catName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        catName=findViewById(R.id.cat_name);
        Intent intent = getIntent();
        catName.setText(intent.getStringExtra("name"));
    }
}