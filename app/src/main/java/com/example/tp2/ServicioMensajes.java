package com.example.tp2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServicioMensajes extends Service
{

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        new Thread()
        {
            public void run() {
                while (true){
                  Log.d("Mensaje", "Se mostraran los datos de los ultimos 5 mensajes");
                    try{
                        Thread.sleep(9000);
                    } catch (InterruptedException e){
                        Log.d("Mensaje", "ERROR: " + e.getMessage().toString());
                    }
                }
            }
        }.start();
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
