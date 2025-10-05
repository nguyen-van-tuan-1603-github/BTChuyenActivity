package com.example.baichuyenactivity_nguyenvantuan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String username = edtUsername.getText().toString().trim();

            if (!username.isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
                finish();
            } else {
                edtUsername.setError("Vui lòng nhập tên đăng nhập");
            }
        });
    }
}
