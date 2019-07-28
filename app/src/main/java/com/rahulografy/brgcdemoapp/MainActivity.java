package com.rahulografy.brgcdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long firstClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.e("MainActivity", "onCreate()");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();

        TextView textView4 = findViewById(R.id.textview_4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // if (firstClickTime - System.currentTimeMillis() > 800) {
                Intent intent = new Intent(MainActivity.this, CounterActivity.class);
                intent.putExtra("KEY_INT", 20);
                intent.putExtra("KEY_STRING", "RESET20");
                startActivity(intent);
                // }

                // firstClickTime = System.currentTimeMillis();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart()");
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume()");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause()");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop()");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "onRestart()");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "onDestroy()");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }
}