package com.example.samplewebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        WebView webView = findViewById(R.id.web_view);

        //1. 권한 획득(인터넷
        //2. 내장 브라우저에 자바스크립트 기능 활성화

        //2 필수속성임
        webView.setWebViewClient(new WebViewClient());//외부 브라우저 띄우지않기(내장
        webView.getSettings().setJavaScriptEnabled(true);


        Intent intent = getIntent();
        String btn = intent.getStringExtra("btn");
        if(btn.equals("a")){
            webView.loadUrl("http://ggoreb.com/game/2048");
        }else if(btn.equals("b")){
            webView.loadUrl("http://ggoreb.com/game/omok");
        }
    }
}
