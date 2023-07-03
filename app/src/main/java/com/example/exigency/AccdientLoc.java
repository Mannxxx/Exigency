package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class AccdientLoc extends AppCompatActivity {

    WebView Accwv;
    Button reached;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accdient_loc);

        Accwv = findViewById(R.id.webview2);
        Accwv.setWebViewClient(new MyBrowser());
        Accwv.getSettings().setLoadsImagesAutomatically(true);
        Accwv.getSettings().setJavaScriptEnabled(true);
        reached=findViewById(R.id.button15);

        Accwv.loadUrl("https://www.google.com/maps/place/Shankara+Group+of+Institution/@27.029487,75.8948331,17z/data=!3m1!4b1!4m5!3m4!1s0x396daff06bcf1241:0xffb04190ba26b380!8m2!3d27.029487!4d75.8970218");



        reached.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc=new Intent(AccdientLoc.this,drivside.class);
                startActivity(acc);

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
