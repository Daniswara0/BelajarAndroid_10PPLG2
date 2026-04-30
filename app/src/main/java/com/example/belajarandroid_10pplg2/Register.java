package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    EditText edtNamaRegister;
    EditText edtGmailRegister;
    EditText edtAlamatRegister;
    EditText edtNomorRegister;
    EditText edtPassworRegister;
    EditText edtConfirmPasswordRegister;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        edtNamaRegister = (EditText) findViewById(R.id.edtNamaRegister);
        edtGmailRegister = (EditText) findViewById(R.id.edtEmailRegister);
        edtAlamatRegister = (EditText) findViewById(R.id.edtAlamatRegister);
        edtNomorRegister = (EditText) findViewById(R.id.edtNomorRegister);
        edtPassworRegister = (EditText) findViewById(R.id.edtPasswordRegister);
        edtConfirmPasswordRegister = (EditText) findViewById(R.id.edtConfirmPasswordRegister);
        btnNext = (Button) findViewById(R.id.btnNext);
        
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = edtNamaRegister.getText().toString();
                String email = edtGmailRegister.getText().toString();
                String alamat = edtAlamatRegister.getText().toString();
                String nomor = edtNomorRegister.getText().toString();
                String passwordRegister = edtPassworRegister.getText().toString();
                String confirmPasswordRegister = edtConfirmPasswordRegister.getText().toString();
                
                if(confirmPasswordRegister.equals(passwordRegister)){
                    Toast.makeText(Register.this, "Sukses terdaftar", Toast.LENGTH_SHORT).show();
                    Intent intentRegister = new Intent(Register.this, ConfirmRegister.class);
                    intentRegister.putExtra("nama", nama);
                    intentRegister.putExtra("email", email);
                    intentRegister.putExtra("alamat", alamat);
                    intentRegister.putExtra("nomor", nomor);
                    startActivity(intentRegister);


                } else if (confirmPasswordRegister!=(passwordRegister)) {
                    Toast.makeText(Register.this, "Confirmasi password salah!", Toast.LENGTH_SHORT).show();
                }else if(confirmPasswordRegister.isEmpty()){
                    Toast.makeText(Register.this, "Confirmasi password terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
}