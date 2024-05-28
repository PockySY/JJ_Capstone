package com.example.starspick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Recommend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        // 뒤로가기 버튼 (Mainactivity 화면으로 되돌아 가기)
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // RecommendActivity에서 MainActivity로 화면 전환
                Intent intent = new Intent(Recommend.this, MainActivity.class);
                startActivity(intent);
                // RecommendActivity 종료
                finish();
            }
        });

        // (예시1) 식당정보 버튼
        Button resInf_btn1 = findViewById(R.id.res_btn1);
        resInf_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 Restaurant.xml로 화면 전환
                Intent intent = new Intent(Recommend.this, Restaurant.class);
                startActivity(intent);

                // 이전 화면 삭제
                finish();
            }
        });

    }
}