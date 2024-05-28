package com.example.starspick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 로그인 버튼(임시)
        Button logBtn = findViewById(R.id.log_btn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_recommend.xml로 화면 전환
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });


    }
}