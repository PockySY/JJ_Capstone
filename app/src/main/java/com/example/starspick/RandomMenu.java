package com.example.starspick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RandomMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_menu);

        // 뒤로가기 버튼 (Mainactivity 화면으로 되돌아 가기)
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // MainActivity로 화면 전환
                Intent intent = new Intent(RandomMenu.this, MainActivity.class);
                startActivity(intent);
                // 현재화면 종료
                finish();
            }
        });
    }
}