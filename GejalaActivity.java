package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GejalaActivity extends AppCompatActivity {
    ImageView img;
    TextView gejala;

    String[]Gejala=new String[]{
            "Gejala awal infeksi virus Corona atau COVID-19 bisa menyerupai gejala flu, yaitu demam, pilek, batuk kering, sakit tenggorokan, dan sakit kepala. Setelah itu, gejala dapat hilang dan sembuh atau malah memberat. Penderita dengan gejala yang berat bisa mengalami demam tinggi, batuk berdahak bahkan berdarah, sesak napas, dan nyeri dada. Gejala-gejala tersebut muncul ketika tubuh bereaksi melawan virus Corona.\n" +
                    "\n" +
                    "Secara umum, ada 3 gejala umum yang bisa menandakan seseorang terinfeksi virus Corona, yaitu:\n" +
                    "\n" +
                    "1. Demam (suhu tubuh di atas 38 derajat Celsius)\n" +
                    "2. Batuk\n" +
                    "3. Sesak napas\n" +"\n"+
                    "Gejala-gejala COVID-19 ini umumnya muncul dalam waktu 2 hari sampai 2 minggu setelah penderita terpapar virus Corona."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("GEJALA KLINIS");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            img = (ImageView) findViewById(R.id.image2);
            gejala = (TextView) findViewById(R.id.tv_gejala);

            gejala.setText(Gejala[0]);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return super.onSupportNavigateUp();


    }
}
