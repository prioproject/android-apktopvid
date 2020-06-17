package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SosialActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosial);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("SOSIAL DISTANCE");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
