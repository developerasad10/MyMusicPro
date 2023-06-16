package com.asadkhan.mymusicpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class VideoPlayer extends AppCompatActivity {

    WebView webView1;
    public static String video_link = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);
        //---------------add url----------------
        //video_link = "https://www.youtube.com/embed/qtz5mpvgAM0";

        //---------------add id-----------------
        webView1 = findViewById(R.id.webView1);

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl(video_link);
    }
}