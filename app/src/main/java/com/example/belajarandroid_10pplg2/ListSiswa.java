package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSiswa extends AppCompatActivity {

    RecyclerView rvListSiswa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_siswa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListSiswa= (RecyclerView) findViewById(R.id.rvListSiswa);
        ArrayList<SiswaModel> listDataSiswa = new ArrayList<>();

        SiswaModel siswa1 =  new SiswaModel("Albay","1","Jati",R.drawable.fotocowo, "");
        SiswaModel siswa2 =  new SiswaModel("Abdilah","2","Ngembal", R.drawable.fotocowo, "");
        SiswaModel siswa3 =  new SiswaModel("Abitro","3","Kudus", R.drawable.fotocowo, "");
        SiswaModel siswa4 =  new SiswaModel("Arham","4","Kudus", R.drawable.fotocowo, "");
        SiswaModel siswa5 =  new SiswaModel("Zahra","12","Kediri", R.drawable.fotocewe, "");
        SiswaModel siswa6 =  new SiswaModel("Nasya","33","Loram", R.drawable.fotocewe, "");
        SiswaModel siswa7 =  new SiswaModel("Savanna","36","Jakarta", R.drawable.fotocewe, "");
        SiswaModel siswa8 =  new SiswaModel("Nesa","7","Besito", R.drawable.fotocewe, "");
        SiswaModel siswa9 =  new SiswaModel("Bhisma","6","Jaksel", R.drawable.fotocowo, "");
        SiswaModel siswa10 =  new SiswaModel("Hizbul","17","Gondosari", R.drawable.fotocowo, "");

        listDataSiswa.add(siswa1);
        listDataSiswa.add(siswa2);
        listDataSiswa.add(siswa3);
        listDataSiswa.add(siswa4);
        listDataSiswa.add(siswa5);
        listDataSiswa.add(siswa6);
        listDataSiswa.add(siswa7);
        listDataSiswa.add(siswa8);
        listDataSiswa.add(siswa9);
        listDataSiswa.add(siswa10);

        AdapterListSiswa adapter = new AdapterListSiswa(listDataSiswa, siswa -> {
            Toast.makeText(this, "Halo " + siswa.getNama(), Toast.LENGTH_SHORT).show();
            Intent in = new Intent(ListSiswa.this, DetailListSiswa.class);
            in.putExtra("nama", siswa.getNama());
            in.putExtra("detail", siswa.getDetailInfo());
            startActivity(in);
        });
        rvListSiswa.setLayoutManager(new LinearLayoutManager(this));
        rvListSiswa.setAdapter(adapter);
    }
}