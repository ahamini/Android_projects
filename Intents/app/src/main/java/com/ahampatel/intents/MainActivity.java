package com.ahampatel.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txt_intent;
Button btn_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_intent=findViewById(R.id.edt_body);
        btn_mail=findViewById(R.id.btn_mail);
        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent=new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/html");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"this is the email using Intent");
                emailIntent.putExtra(Intent.EXTRA_TEXT,txt_intent.getText().toString());
                startActivity(emailIntent);

            }
        });
//        String url="https://www.google.com";
//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        startActivity(intent);

//        Intent phoneIntent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:+916387683270"));
//        startActivity(phoneIntent);

//        Intent appIntent=getPackageManager().getLaunchIntentForPackage("com.ahampatel.mycalculator");
//        System.out.println("00star"+appIntent);
//        startActivity(appIntent);
    }
}