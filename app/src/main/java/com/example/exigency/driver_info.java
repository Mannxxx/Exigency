package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class driver_info extends AppCompatActivity {
    TextView sh;
    driverdatabase dvb;
    StringBuilder str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_info);
        sh=findViewById(R.id.textView15);
        dvb=new driverdatabase(driver_info.this);
        str=new StringBuilder();

        Cursor cursor=dvb.getData();
        if(cursor.getCount()==0){
            sh.setText("data not found...");
        }
        else {
            while(cursor.moveToNext()){
                str.append((cursor.getString(0)+"\n"));
                str.append((cursor.getString(1)+"\n"));
                str.append((cursor.getString(2)+"\n"));
                str.append((cursor.getString(3)+"\n"));
                str.append("-----------------------"+"\n");
            }
            sh.setText(str.toString());
        }

    }
}
