package com.example.starspick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 추천 버튼 화면전환 기능
        LinearLayout main_linearLayout1 = findViewById(R.id.main_linearLayout1);
        main_linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_recommend.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, Recommend.class);
                startActivity(intent);
                finish();
            }
        });

        // 2. 탐색 버튼 화면전환 기능
        LinearLayout main_linearLayout2 = findViewById(R.id.main_linearLayout2);
        main_linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_search.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });


        // 3. 맛 지도 버튼 화면전환 기능
        LinearLayout main_linearLayout3 = findViewById(R.id.main_linearLayout3);
        main_linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_location.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, Location.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });


        // 4. 가성비 버튼 화면전환 기능
        LinearLayout main_linearLayout4 = findViewById(R.id.main_linearLayout4);
        main_linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_price.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, Price.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });



        // 5. 날씨 버튼 화면전환 기능
        LinearLayout main_linearLayout5 = findViewById(R.id.main_linearLayout5);
        main_linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_weather.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, Weather.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });



        // 6. 제휴 업체 버튼 화면전환 기능
        LinearLayout main_linearLayout6 = findViewById(R.id.main_linearLayout6);
        main_linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_cooperation.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this,Cooperation.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });




        // 7. 오늘의 추천 버튼 화면전환 기능
        LinearLayout main_linearLayout7 = findViewById(R.id.main_linearLayout7);
        main_linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_todaysuggest.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, TodaySuggest.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });


        // 8. 랜덤 메뉴 버튼 화면전환 기능
        LinearLayout main_linearLayout8 = findViewById(R.id.main_linearLayout8);
        main_linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 activity_randommenu.xml로 화면 전환
                Intent intent = new Intent(MainActivity.this, RandomMenu.class);
                startActivity(intent);

                // MainActivity 화면 삭제
                finish();
            }
        });






        // ((수정 예정))   로그아웃 뒤로가기 버튼 (Mainactivity 화면으로 되돌아 가기)
        Button logOutBtn = findViewById(R.id.logout_btn);
        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // RecommendActivity에서 MainActivity로 화면 전환
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
    }


}