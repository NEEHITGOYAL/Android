package com.example.broadcastservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
    public static TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        t = findViewById(R.id.counter);
        IntentFilter start = new IntentFilter("start service");
        IntentFilter end = new IntentFilter("end service");
        MyReceiver reciever = new MyReceiver();
        registerReceiver(reciever,start);
        registerReceiver(reciever,end);
    }
}