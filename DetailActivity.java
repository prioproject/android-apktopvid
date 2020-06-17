package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnarti, btngejala, btncegah, btnsosial,btnlayanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("MENU UTAMA");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            btnarti = (Button) findViewById(R.id.btn_arti);
            btnarti.setOnClickListener(this);

            btngejala = (Button) findViewById(R.id.btn_gejala);
            btngejala.setOnClickListener(this);

            btncegah = (Button) findViewById(R.id.btn_cegah);
            btncegah.setOnClickListener(this);

            btnsosial = (Button) findViewById(R.id.btn_social);
            btnsosial.setOnClickListener(this);

            btnlayanan = (Button) findViewById(R.id.btn_layanan);
            btnlayanan.setOnClickListener(this);


        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_arti:
                Intent I=new Intent(DetailActivity.this,PengertianActivity.class);
                startActivity(I);
                break;
        }
        switch (view.getId()){
            case R.id.btn_gejala:
                Intent I=new Intent(DetailActivity.this,GejalaActivity.class);
                startActivity(I);
                break;
        }
        switch(view.getId()){
            case R.id.btn_cegah:
                Intent I=new Intent(DetailActivity.this,PencegahanActivity.class);
                startActivity(I);
                break;
        }
        switch(view.getId()){
            case R.id.btn_social:
                Intent I=new Intent(DetailActivity.this,SosialActivity.class);
                startActivity(I);
                break;
        }

        switch(view.getId()){
            case R.id.btn_layanan:
                Intent I=new Intent(DetailActivity.this,LayananActivity.class);
                startActivity(I);
                break;
        }

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
