package com.aplication.projectuas;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txnama, txmain, judul;
    ImageView img;
    Button btninfo, btnservice, btnttg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txnama = (TextView) findViewById(R.id.nama);
        getSupportActionBar().hide();


        txmain = (TextView) findViewById(R.id.tvMain);

        judul = (TextView) findViewById(R.id.judul);


        img = (ImageView) findViewById(R.id.icon);

        btninfo = (Button) findViewById(R.id.btn_menu);
        btninfo.setOnClickListener(this);

        btnttg = (Button) findViewById(R.id.btn_tentang);
        btnttg.setOnClickListener(this);

        btnservice = (Button) findViewById(R.id.btn_service);
        btnservice.setOnClickListener(this);






    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_menu:
                Intent I = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(I);

                break;


        }
        switch (view.getId()) {
            case R.id.btn_tentang:
                Intent I = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(I);
                break;

        }

        switch (view.getId()) {
            case R.id.btn_service:
                Intent I = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(I);
                break;
        }
    }
}

