package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PengertianActivity extends AppCompatActivity {
    ImageView images;
    TextView pengertian;

    int x;

    String[]Pengertian=new String[ ]{
            "COVID-19 merupakan akronim dari coronavirus disease 2019,Adalah virus baru penyebab gangguan saluran pernafasan yang berasal dari China dan merupakan satu keluarga dengan  virus penyebab SARS dan MERS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("TENTANG COVID-19");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            images = (ImageView) findViewById(R.id.iv_arti);
            pengertian = (TextView) findViewById(R.id.tv_ket);

            pengertian.setText(Pengertian[x]);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
