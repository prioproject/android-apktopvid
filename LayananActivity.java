package com.aplication.projectuas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LayananActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnbnpb, btnjkt, btnhelo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("INFO LAYANAN");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            btnbnpb = (Button) findViewById(R.id.bt_bnpb);
            btnbnpb.setOnClickListener(this);

            btnjkt = (Button) findViewById(R.id.bt_jakarta);
            btnjkt.setOnClickListener(this);

            btnhelo = (Button) findViewById(R.id.bt_helodoc);
            btnhelo.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.bt_bnpb:
                Uri uri = Uri.parse("https://covid19.go.id/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;


        }


        switch (view.getId()) {
            case R.id.bt_jakarta:
                Uri uri2 = Uri.parse("https://corona.jakarta.go.id/id/contact");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;

        }
        switch (view.getId()) {
            case R.id.bt_helodoc:
                Uri uri3 = Uri.parse("https://www.halodoc.com/tanya-jawab-seputar-virus-corona/");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent3);
                break;
        }


    }
}