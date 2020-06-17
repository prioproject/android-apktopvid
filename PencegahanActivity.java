package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PencegahanActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;


    String[]cegah=new String[]{

            "Rutin mencuci tangan dengan air dan sabun atau hand sanitizer yang mengandung alkohol minimal 70%, terutama setelah beraktivitas di luar rumah atau di tempat umum.",
            "Tingkatkan daya tahan tubuh dengan pola makan sehat dan makanan yang sehat",
            "Tingkatkan daya tahan tubuh dengan pola hidup sehat atau rajin olah raga",
            "Gunakan masker saat beraktivitas di tempat umum atau keramaian, termasuk saat pergi berbelanja bahan makanan.",
            "Bila Anda mengalami gejala infeksi virus Corona (COVID-19), hubungi hotline COVID-19 di 119 Ext. 9,untuk mendapatkan keterangan lebih lanjut",
            "Berdoa kepada Tuhan TME, semoga kita, keluarga dan saudara kita terhindar dari pandemi dan semoga pandemi covid segera berlalu",


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencegahan);

        if(getSupportActionBar() !=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("PENCEGAHAN");


            tv1 = (TextView) findViewById(R.id.name_cuci);
            tv2 = (TextView) findViewById(R.id.name_makan);
            tv3 = (TextView) findViewById(R.id.name_olah);
            tv4 = (TextView) findViewById(R.id.name_masker);
            tv5 = (TextView) findViewById(R.id.name_faskes);


            iv1 = (ImageView) findViewById(R.id.image3);
            iv2 = (ImageView) findViewById(R.id.image4);
            iv3 = (ImageView) findViewById(R.id.image5);
            iv4 = (ImageView) findViewById(R.id.image6);
            iv5 = (ImageView) findViewById(R.id.image7);


            tv1.setText(cegah[0]);
            tv2.setText(cegah[1]);
            tv3.setText(cegah[2]);
            tv4.setText(cegah[3]);
            tv5.setText(cegah[4]);


        }

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
