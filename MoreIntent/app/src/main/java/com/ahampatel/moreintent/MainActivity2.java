package com.ahampatel.moreintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView txt_Act2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    txt_Act2=findViewById(R.id.textView);
    String myvalue=getIntent().getExtras().getString("UniqueId");
    txt_Act2.setText(myvalue);
    }
}