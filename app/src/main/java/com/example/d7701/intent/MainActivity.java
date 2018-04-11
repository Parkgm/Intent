package com.example.d7701.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
        startActivity(intent);
    }

    public void Button2(View view) {
        Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-3997-7195"));
        startActivity(intent2);
    }


    //커밋이 되었을까요?
    //커밋이 되었을까요?
}
