package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmRegister extends AppCompatActivity {

    TextView txtNamaConfirmRegister;
    TextView txtEmailConfirmRegister;
    TextView txtAlamatConfirmRegister;
    TextView txtNomorConfirmRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_register);

        txtNamaConfirmRegister = findViewById(R.id.txtNamaConfirmRegister);
        txtEmailConfirmRegister = findViewById(R.id.txtEmailConfirmRegister);
        txtAlamatConfirmRegister = findViewById(R.id.txtAlamatConfirmRegister);
        txtNomorConfirmRegister = findViewById(R.id.txtNomorConfirmRegister);

        Intent intentRegister = getIntent();
        String nama = intentRegister.getStringExtra("nama");
        String email = intentRegister.getStringExtra("email");
        String alamat = intentRegister.getStringExtra("alamat");
        String nomor = intentRegister.getStringExtra("nomor");

        txtNamaConfirmRegister.setText(nama);
        txtEmailConfirmRegister.setText(email);
        txtAlamatConfirmRegister.setText(alamat);
        txtNomorConfirmRegister.setText(nomor);

    }
}