package com.example.datapassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        TextView showdata = (TextView) findViewById(R.id.secondactshow);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("NAME","anonyomous");
            int age = bundle.getInt("AGE",0);
            String result = "Hello " + name + '\n' +" Your Age is :"  + age;
            showdata.setText(result);
        }
    }
}