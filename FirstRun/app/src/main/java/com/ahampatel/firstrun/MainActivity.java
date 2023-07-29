package com.ahampatel.firstrun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SharedPreferences prefs;
    Context context;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        txt=findViewById(R.id.textBox);
        prefs=context.getSharedPreferences("appprefs",0);
    if(getFirstPrefs()){
        setRunned();
        txt.setText("You Open for 1st Time");
    }
    else{
        txt.setText("You Open it Previously");
    }
    }
    boolean getFirstPrefs(){
        return prefs.getBoolean("FirstRun",true);
    }
    void setRunned(){
        SharedPreferences.Editor edit= prefs.edit();
        edit.putBoolean("FirstRun",false);
        edit.commit();
    }
}