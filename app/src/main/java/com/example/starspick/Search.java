package com.example.starspick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // 뒤로가기 버튼 (Mainactivity 화면으로 되돌아 가기)
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // RecommendActivity에서 MainActivity로 화면 전환
                Intent intent = new Intent(Search.this, MainActivity.class);
                startActivity(intent);
                // RecommendActivity 종료
                finish();
            }
        });
    }

}