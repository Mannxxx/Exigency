package com.example.exigency;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databaseuser extends SQLiteOpenHelper {
    public databaseuser(@Nullable Context context) {
        super(context, "code_warriors", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table="CREATE TABLE userdata(uname TEXT,ucontact TEXT,uaadhaar TEXT,upassword TEXT,urepass TEXT)";
        db.execSQL(table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void adddata(String nm,String cntn,String adar,String pswd,String repswd){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("uname",nm);
        cv.put("ucontact",cntn);
        cv.put("uaadhaar",adar);
        cv.put("upass",pswd);
        cv.put("urepass",repswd);
        db.insert("userdata",null,cv);
    }
    public Cursor getData(){
        SQLiteDatabase db=this.getWritableDatabase();
        String d="SELECT * FROM USERDATA";
        Cursor c=db.rawQuery(d,null);
        return c;
    }
}
