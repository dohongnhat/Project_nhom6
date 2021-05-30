package com.example.nhom6_soc.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.nhom6_soc.MainActivity;
import com.example.nhom6_soc.R;

public class SignInActivity extends AppCompatActivity {
    private EditText username, password, address;
    private RadioButton admin, user;
    private Button register, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        username = findViewById(R.id.edtTaikhoan);
        password = findViewById(R.id.edtMatkhau);
        address = findViewById(R.id.edtDiachi);
        admin = findViewById(R.id.rbAdmin);
        user = findViewById(R.id.rbUser);
        register = findViewById(R.id.btnDangki);
        back = findViewById(R.id.btnQuaylai);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}