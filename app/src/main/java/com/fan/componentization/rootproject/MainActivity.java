package com.fan.componentization.rootproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fan.componentization.module_cart.CartUtil;
import com.fan.componentization.module_home.HomeMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toHome(View view) {
        Intent intent  = new Intent(this, HomeMainActivity.class);
        startActivity(intent);
    }
}