package com.example.datapassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.mainactivityname);
        EditText age = findViewById(R.id.mainactivityage);
        Button sendbtn = findViewById(R.id.mainactivitysend);
         sendbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(), Secondactivity.class);
                 intent.putExtra("NAME", name.getText().toString());
                 int Age = Integer.parseInt(age.getText().toString());
                 intent.putExtra("AGE", Age);
                 startActivity(intent);
             }
         });

    }
}