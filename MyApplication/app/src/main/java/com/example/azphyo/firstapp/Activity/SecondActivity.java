package com.example.azphyo.firstapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.azphyo.firstapp.MainActivity;
import com.example.azphyo.firstapp.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ACTIVITY","SecondActivity created......");
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY", "SecondActivity Started.......");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY", "SecondActivity Stoped.......");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY", "SecondActivity Destroyed....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY", "SecondActivity Restarted.....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY", "SecondActivity Resumed......");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY", "SecondActivity Paused.......");
    }
}
