package com.example.belajarandroid_10pplg2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailLagu extends AppCompatActivity {

    ImageView imageLagu;
    TextView judulLagu;
    TextView namaPenyanyi;
    TextView durasiLagu;
    TextView detailLagu;
    String linkLagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_lagu);

        imageLagu = findViewById(R.id.ImageLaguDetail);
        judulLagu = findViewById(R.id.tvJudulLaguDetail);
        namaPenyanyi = findViewById(R.id.tvNamaPenyanyiDetail);
        durasiLagu = findViewById(R.id.tvDurasiLaguDetail);
        detailLagu = findViewById(R.id.tvDetail);

        String judul = getIntent().getStringExtra("judul");
        String penyanyi = getIntent().getStringExtra("penyanyi");
        String durasi = getIntent().getStringExtra("durasi");
        String detail = getIntent().getStringExtra("detail");
        int image = getIntent().getIntExtra("image", 0);

        judulLagu.setText(judul);
        namaPenyanyi.setText(penyanyi);
        durasiLagu.setText(durasi);
        detailLagu.setText(detail);
        imageLagu.setImageResource(image);

        imageLagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}