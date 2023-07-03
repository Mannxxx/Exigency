package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class showdata extends AppCompatActivity {
    databaseuser objt;
    StringBuilder b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        t=findViewById(R.id.textView14);
        objt=new databaseuser(showdata.this);
        b=new StringBuilder();

        Cursor cursor=objt.getData();
        if(cursor.getCount()==0){
            t.setText("data not found...");
        }
        else {
            while(cursor.moveToNext()){
                b.append((cursor.getString(0)+"\n"));
                b.append((cursor.getString(1)+"\n"));
                b.append((cursor.getString(2)+"\n"));
                b.append((cursor.getString(3)+"\n"));
                b.append((cursor.getString(4)+"\n"));
                b.append((cursor.getString(5)+"\n"));
                b.append("-----------------------"+"\n");
            }
            t.setText(b.toString());
        }
    }
}
