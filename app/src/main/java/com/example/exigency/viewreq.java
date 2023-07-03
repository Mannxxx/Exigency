package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class viewreq extends AppCompatActivity {
TextView welcome;
Button req;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewreq);
        welcome=findViewById(R.id.textView21);
        req=findViewById(R.id.button17);
        req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res=new Intent(viewreq.this,driverresponse.class);
                startActivity(res);
            }
        });
    }
}
