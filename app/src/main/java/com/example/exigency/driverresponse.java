package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class driverresponse extends AppCompatActivity {
TextView lo;
Button acc,psss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverresponse);
        lo=findViewById(R.id.textView22);
        acc=findViewById(R.id.button18);
        psss=findViewById(R.id.button19);
        lo.setText("Emergency Case, Urgent arrival required!");
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accc=new Intent(driverresponse.this,AccdientLoc.class);
                startActivity(accc);
            }
        });
        psss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pssss=new Intent(driverresponse.this,viewreq.class);
                startActivity(pssss);
            }
        });
    }
}
