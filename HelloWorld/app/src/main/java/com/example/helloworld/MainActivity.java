package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Hello";
    private static final String TAG2 = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG2,"on create......");
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.but);
        TextView t = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"clicked");
                Toast.makeText(getApplicationContext(),"you clicked button",Toast.LENGTH_SHORT).show();
                t.setText("Hello Neehit ");
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG2,"on start ........");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG2,"on Resume ........");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG2,"On PAUSE .........");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG2,"ON STOP ......");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG2,"On Restart ........");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG2,"On Destroy ........");
    }
}