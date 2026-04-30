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

public class LoginConstraint extends AppCompatActivity {

    Button btnRegister2;
    Button btnLogin2;
    EditText edtUsernameLogin2;
    EditText edtPasswordLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_constraint);
        edtUsernameLogin2 = (EditText) findViewById(R.id.edtUsernameLogin2);
        edtPasswordLogin2 = (EditText) findViewById(R.id.edtPasswordLogin2);
        btnLogin2 = (Button) findViewById(R.id.btnLogin2);
        btnRegister2 = (Button) findViewById(R.id.btnRegister2);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUsernameLogin2.getText().toString();
                String password = edtPasswordLogin2.getText().toString();


                if(username.equals("nesa") && password.equals("admin")){
                    Toast.makeText(LoginConstraint.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginConstraint.this, HomePage.class);
                    intent.putExtra("username", username);
                    finish();
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginConstraint.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}