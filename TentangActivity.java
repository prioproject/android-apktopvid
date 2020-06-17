package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setTitle("TENTANG KAMI");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
