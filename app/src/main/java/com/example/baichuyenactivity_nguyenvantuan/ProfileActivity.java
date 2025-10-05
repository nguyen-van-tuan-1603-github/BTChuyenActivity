package com.example.baichuyenactivity_nguyenvantuan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    ImageView imgSetting;
    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgSetting = findViewById(R.id.imgSetting);
        txtWelcome = findViewById(R.id.txtWelcome);

        String username = getIntent().getStringExtra("username");
        txtWelcome.setText("Xin chào, " + username);

        imgSetting.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
