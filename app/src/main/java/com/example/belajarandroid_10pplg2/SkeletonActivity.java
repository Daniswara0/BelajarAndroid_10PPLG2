package com.example.belajarandroid_10pplg2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SkeletonActivity extends AppCompatActivity {

    Button buttonNextSkeleton;
    TextView namaSkeleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skeleton);

        namaSkeleton = findViewById(R.id.namaSkeleton);
        buttonNextSkeleton = findViewById(R.id.buttonNextSkeleton);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("BelajarSharedPrefences", Context.MODE_PRIVATE);
        String nama = sp.getString("nama", "");
        namaSkeleton.setText(nama);

        buttonNextSkeleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkeletonActivity.this, ListLagu.class));
            }
        });

    }
}