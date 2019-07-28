package com.rahulografy.brgcdemoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private int counter = 0;
    private Button buttonDecrement, buttonIncrement, buttonReset;
    private TextView textViewCounter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_counter);

        // if(getIntent().getExtras().getInt("KEY_INT")==null) {
        counter = getIntent().getExtras().getInt("KEY_INT");
        String resetText = getIntent().getExtras().getString("KEY_STRING");

        initViews(resetText);
    }

    private void initViews(String resetText) {

        textViewCounter = findViewById(R.id.textview_counter);
        textViewCounter.setText(String.valueOf(counter));

        buttonDecrement = findViewById(R.id.button_decrement);
        buttonIncrement = findViewById(R.id.button_increment);
        buttonReset = findViewById(R.id.button_reset);
        buttonReset.setText(resetText);

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewCounter.setText(String.valueOf(--counter));
            }
        });

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewCounter.setText(String.valueOf(++counter));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                textViewCounter.setText(String.valueOf(counter));
            }
        });
    }
}