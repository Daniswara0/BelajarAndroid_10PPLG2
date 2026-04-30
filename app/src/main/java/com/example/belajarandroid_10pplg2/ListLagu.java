package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListLagu extends AppCompatActivity {

    RecyclerView rvListLagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_lagu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListLagu = findViewById(R.id.rvListLagu);
        ArrayList<LaguModel> listDataLagu = new ArrayList<>();

        LaguModel lagu1 = new LaguModel("WAIT FOR U", "Future, Drake, Tems", "3:09", R.drawable.wait, "Lagu ini menceritakan tentang hubungan yang penuh penantian dan emosi. Kolaborasi antara Future, Drake, dan Tems memberikan nuansa R&B yang mellow dan menyentuh.");
        LaguModel lagu2 = new LaguModel("Right My Wrongs", "Bryson Tiller", "4:10", R.drawable.right, "Lagu ini menggambarkan penyesalan dan keinginan untuk memperbaiki kesalahan dalam hubungan. Ciri khas Bryson Tiller dengan gaya trap soul sangat terasa.");
        LaguModel lagu3 = new LaguModel("Body & Soul", "Joeboy", "2:30", R.drawable.body, "Lagu dengan vibe santai yang membahas tentang cinta dan ketertarikan yang tulus. Musiknya ringan dan cocok didengarkan saat santai.");
        LaguModel lagu4 = new LaguModel("Prove It", "21 Savage, Summer Walker", "3:25", R.drawable.prove, "Lagu ini bercerita tentang pembuktian dalam hubungan. Perpaduan suara 21 Savage dan Summer Walker menciptakan nuansa hip-hop dan R&B yang kuat.");
        LaguModel lagu5 = new LaguModel("Crew", "GoldLink, Brent Faiyaz, Shy Glizzy", "3:00", R.drawable.crew, "Lagu ini menggambarkan kehidupan bersama teman-teman (crew) dan kesuksesan yang diraih bersama. Beat-nya catchy dan enak didengar.");

        listDataLagu.add(lagu1);
        listDataLagu.add(lagu2);
        listDataLagu.add(lagu3);
        listDataLagu.add(lagu4);
        listDataLagu.add(lagu5);

        AdapterLagu adapter = new AdapterLagu(listDataLagu, lagu -> {
            Toast.makeText(this, "Kamu memilih " + lagu.getJudulLagu(), Toast.LENGTH_SHORT).show();

            Intent in = new Intent(ListLagu.this, DetailLagu.class);
            in.putExtra("judul", lagu.getJudulLagu());
            in.putExtra("penyanyi", lagu.getNamaPenyanyi());
            in.putExtra("durasi", lagu.getDurasiLagu());
            in.putExtra("detail", lagu.getDetailLagu());
            in.putExtra("image", lagu.getImageLagu());
            startActivity(in);
        });

        rvListLagu.setLayoutManager(new LinearLayoutManager(this));
        rvListLagu.setAdapter(adapter);
    }
}