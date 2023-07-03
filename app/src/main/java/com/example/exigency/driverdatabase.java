package com.example.exigency;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class driverdatabase  extends SQLiteOpenHelper {
    public driverdatabase(@Nullable Context context) {
        super(context, "Code warriors", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dtab="CREATE TABLE driver(dname TEXT, dcontact TEXT, dlicience TEXT,daadhar TEXT,dpass Text,drepass TEXT)";
        db.execSQL(dtab);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  void adddatad(String dnm,String dcn, String dlc,String dad,String dps,String dprs){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("dname",dnm);
        cv.put("dcontact",dcn);
        cv.put("dlicience",dlc);
        cv.put("daadhar",dad);
        cv.put("dpass",dps);
        cv.put("drepass",dprs);
        db.insert("driver",null,cv);
    }
    public Cursor getData(){
        SQLiteDatabase db=this.getWritableDatabase();

        String st="SELECT * FROM RECORD";
        Cursor cu=db.rawQuery(st,null);
        return  cu;
    }
}
