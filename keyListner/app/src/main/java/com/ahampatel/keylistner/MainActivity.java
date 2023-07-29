package com.ahampatel.keylistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText edit1,edit2,edit3,edit4,edit5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Allows decimals and signs
        edit1=(EditText) findViewById(R.id.edt1);
        DigitsKeyListener dkl1=DigitsKeyListener.getInstance(true ,true);
        edit1.setKeyListener(dkl1);

        //Allows only decimals
        edit2=(EditText) findViewById(R.id.edt2);
        DigitsKeyListener dkl2=DigitsKeyListener.getInstance(false,true);
        edit2.setKeyListener(dkl2);

        //date keylistner
        edit3=(EditText) findViewById(R.id.edt3);
        DateKeyListener dkl3=DateKeyListener.getInstance();
        edit3.setKeyListener(dkl3);

        //multitap keylistner
        edit4=(EditText) findViewById(R.id.edt4);
        MultiTapKeyListener dkl4=MultiTapKeyListener.getInstance(true,TextKeyListener.Capitalize.WORDS);
        edit4.setKeyListener(dkl4);

        //Allows to Quert layout for typing
        edit5=(EditText) findViewById(R.id.edt5);
        QwertyKeyListener dkl5=QwertyKeyListener.getInstance(true,TextKeyListener.Capitalize.SENTENCES);
    }
}