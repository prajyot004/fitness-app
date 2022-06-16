package com.example.bodybuild;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqHelper extends SQLiteOpenHelper {
    public final static String Database_name ="StepData";
    public final static String Table_name ="Entries";
    public final static String col1 ="Time";
    public final static String col2 ="Date";
    public final static String col3 ="Steps";
    public final static String col4 ="Calories";
    public final static String col5 ="Distance";


    public sqHelper(Context context){
        super(context,Database_name,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "+Table_name+"(Time TEXT,Date TEXT,Steps INTEGER,Calories REAL,Distance REAL )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Table_name);
        onCreate(sqLiteDatabase);
    }

    public boolean insertdata(String time,String date,String steps,String calories,String distance){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1,time);
        contentValues.put(col2,date);
        contentValues.put(col3,steps);
        contentValues.put(col4,calories);
        contentValues.put(col5,distance);
        long result= sqLiteDatabase.insert(Table_name,null,contentValues);
        if(result==-1) return false;
        else return true;
    }

    public int deleteData(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.delete(Table_name, "1", null);
    }

    public Cursor viewAllData(){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cs=sqLiteDatabase.rawQuery("SELECT * FROM "+Table_name,null);
        return cs;
    }
}