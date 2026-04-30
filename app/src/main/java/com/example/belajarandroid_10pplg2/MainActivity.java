package com.example.belajarandroid_10pplg2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    Button btnLogin;
    EditText edtUsernameLogin;
    EditText edtPasswordLogin;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtUsernameLogin = (EditText) findViewById(R.id.edtUsernameLogin);
        edtPasswordLogin = (EditText) findViewById(R.id.edtPasswordLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        sp = getSharedPreferences("BelajarSharedPrefences", Context.MODE_PRIVATE);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUsernameLogin.getText().toString();
                String password = edtPasswordLogin.getText().toString();
                SharedPreferences.Editor editor = sp.edit();



                if(username.equals("admin") && password.equals("admin")){
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SkeletonActivity.class);
                    editor.putString("nama", username);
                    editor.commit();
//                    intent.putExtra("username", username);
                    finish();
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
    }
}
