package com.ahampatel.datetimeformat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
     TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview=(TextView)findViewById(R.id.txtformat);
//        String dateformat="MM,dd,yy a";
//        String dateformat="dd/MM/yyyy hh:mm aa";
        String dateformat="E MMM,dd/yyyy hh:mm:ss a";
        Date date= Calendar.getInstance().getTime();
        txtview.setText(DateFormat.format(dateformat,date));
    }
}