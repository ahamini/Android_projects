package com.ahampatel.myclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         this.registerReceiver(this.myBatteryReciever,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    BroadcastReceiver myBatteryReciever=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int battery_level= intent.getIntExtra("level",0);
            System.out.println("Battery level is : "+battery_level);
        }
    };
}