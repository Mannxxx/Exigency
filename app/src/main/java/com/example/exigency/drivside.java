package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class drivside extends AppCompatActivity {
TextView drivernm,drvr;
WebView drvw;
Button infm;
Preferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivside);
        infm = findViewById(R.id.button13);
        drivernm = findViewById(R.id.textView18);
        drvw = findViewById(R.id.webview1);

        drvw.setWebViewClient(new MyBrowser());
        drvw.getSettings().setLoadsImagesAutomatically(true);
        drvw.getSettings().setJavaScriptEnabled(true);

        drvw.loadUrl("https://www.google.com/maps/search/nearest+hospital/@27.0319233,75.8288362,12z/data=!3m1!4b1");


        preferences = new Preferences(getApplicationContext());
        drivernm.setText(preferences.getUsername());
        infm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9431896908"));
                startActivity(x);
            }
        });

    }
        private class MyBrowser extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
    }
}
