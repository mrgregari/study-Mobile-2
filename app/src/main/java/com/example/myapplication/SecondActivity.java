package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Bundle extra = getIntent().getExtras();
        TextView tv = findViewById(R.id.searchedAccount);
        String text = extra.getString("text");
        tv.setText(text);
    }

    public void onClick1(View view) {
        Intent intent = new Intent();
        intent.putExtra("key", "account : Account 1");
        setResult(RESULT_OK, intent);
        finish();
    }
}