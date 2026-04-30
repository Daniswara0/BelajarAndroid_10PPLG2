package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorAritmatika extends AppCompatActivity {

    TextView txtUsernameKalkulator;
    EditText edtAngka1;
    EditText edtAngka2;
    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    TextView txtHasil;
    Button btnBersihkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_aritmatika);

        txtUsernameKalkulator = findViewById(R.id.txtUsernameKalkulator);
        edtAngka1 = (EditText) findViewById(R.id.edtAngka1);
        edtAngka2 = (EditText) findViewById(R.id.edtAngka2);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnBersihkan = (Button) findViewById(R.id.btnBersihkan);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        txtUsernameKalkulator.setText(username);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edtAngka1.getText().toString());
                int angka2 = Integer.parseInt(edtAngka2.getText().toString());
                int hasilTambah = angka1 + angka2;
                txtHasil.setText("Hasil: "+hasilTambah);
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edtAngka1.getText().toString());
                int angka2 = Integer.parseInt(edtAngka2.getText().toString());
                int hasilKurang = angka1 - angka2;
                txtHasil.setText("Hasil: "+hasilKurang);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edtAngka1.getText().toString());
                int angka2 = Integer.parseInt(edtAngka2.getText().toString());
                int hasilKali = angka1 * angka2;
                txtHasil.setText("Hasil: "+hasilKali);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1double = Double.parseDouble(edtAngka1.getText().toString());
                double angka2double = Double.parseDouble(edtAngka2.getText().toString());
                double hasilBagi = angka1double / angka2double;
                txtHasil.setText("Hasil: "+hasilBagi);
            }
        });

        btnBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtAngka1.setText("");
                edtAngka2.setText("");
                txtHasil.setText("");
            }
        });

    }
}