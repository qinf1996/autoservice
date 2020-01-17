package com.aleaf.autoservice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aleaf.autoservice.services.IServices;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IServices service = LoaderUtils.getService(IServices.class);
        if (service != null)
            service.start();
    }
}
