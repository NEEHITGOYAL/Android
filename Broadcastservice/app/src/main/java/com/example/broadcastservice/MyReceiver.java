package com.example.broadcastservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;


public class MyReceiver extends BroadcastReceiver  {
    private static int counter1=0,counter2 = 0;
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("start service")){
//            context.startService(new Intent(context.getApplicationContext(),MyService.class));
            counter1++;
            Toast.makeText(context,"Service started" + counter1,Toast.LENGTH_LONG).show();
            Secondactivity.t.setText("start");
        }
        if(intent.getAction().equals("end service")){
//            context.stopService(new Intent(context.getApplicationContext(),MyService.class));
            counter2++;
            Toast.makeText(context,"Service ended" + counter2,Toast.LENGTH_LONG).show();
            Secondactivity.t.setText("end");
        }

        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
    }

}