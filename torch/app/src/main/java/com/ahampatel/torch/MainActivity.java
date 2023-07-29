package com.ahampatel.torch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
boolean isTorchOn=false;
CameraManager cameraManager;
String cameraId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);

        boolean istorchAvailable=getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        if(!istorchAvailable){
            btn.setEnabled(false);
            btn.setText("Torch is not Available");
        }
        cameraManager=(CameraManager) getSystemService(Context.CAMERA_SERVICE);
       try{
        cameraId=cameraManager.getCameraIdList()[0];
        }catch(Exception e){}

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String st=btn.getText().toString();
               if (isTorchOn) {
                   isTorchOn=false;
                   btn.setText("TURN ON TORCH");
                   }
               else {
                   isTorchOn = true;
                   btn.setText("TURN OFF TORCH");
               }
               switchTorch(isTorchOn);
            }
        });
    }
    public void switchTorch(boolean status) {
        try {
            cameraManager.setTorchMode(cameraId, status);
        } catch (Exception e) {
        }
    }
}