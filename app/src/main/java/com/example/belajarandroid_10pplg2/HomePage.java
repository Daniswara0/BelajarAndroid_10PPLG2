package com.example.belajarandroid_10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);

        txtUsername = findViewById(R.id.txtUsername);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        txtUsername.setText("Selamat datang, " + username);
    }
}
