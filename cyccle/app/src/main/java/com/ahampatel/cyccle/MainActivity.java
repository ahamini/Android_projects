package com.ahampatel.cyccle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.text);
        result=(TextView)findViewById(R.id.resul);
        this.registerReceiver(this.myBatteryReciever, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    BroadcastReceiver myBatteryReciever=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int baterylevel=intent.getIntExtra("level",0);
            result.setText("BAttery level is at :" +baterylevel+"%"); }
    };
}