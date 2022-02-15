package com.example.broadcastservice;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        Secondactivity s = new Secondactivity();
//        s.t.setText("Service Active");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }
}