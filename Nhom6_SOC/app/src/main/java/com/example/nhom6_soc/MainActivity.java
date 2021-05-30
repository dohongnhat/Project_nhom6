package com.example.nhom6_soc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nhom6_soc.Activity.SignInActivity;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edtTaikhoan);
        password = findViewById(R.id.edtMatkhau);
        login = findViewById(R.id.btnDangnhap);
        register = findViewById(R.id.btnDangki);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan, matkhau;
                taikhoan = username.getText().toString();
                matkhau = username.getText().toString();
            }
        });

    }
}