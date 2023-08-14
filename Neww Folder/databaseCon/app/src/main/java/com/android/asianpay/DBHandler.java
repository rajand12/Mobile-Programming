package com.android.asianpay;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//reference : CREATE TABLE `TABLE_NAME`(`ID_COL` INTEGER PRIMARY KEY AUTOINCREMENT, `NAME_COL` TEXT, `DURATION_COL` TEXT)

//extend sqliteopenhelper
// string DB_NAME, int DB_VERSION, String TABLE_NAME,
// string ID_COL = "id", NAME_COL = "name", DURATION_COL = "duration"


//todo 4 : extends SQLiteOpenHelper and fix errors by overriding


public class DBHandler extends SQLiteOpenHelper{


    //todo 5 :  make static final String DB_NAME, DB_VERSION, TABLE_NAME, ID_COL, NAME_COL, DURATION_COL

    //see the example below
     private static final String DB_NAME = "asian";
     private static final int DB_VERSION = 1;
     private static final String TABLE_NAME = "course";
     private static final String ID_COL = "id";
     private static final String NAME_COL = "name";
     private static final String DURATION_COL = "duration";

    /////////////////////////////////////////////////////////////////////////////////////////////

    //todo 6 : make constructor with argument as `Context context` where a super is called with (context.db_name,null,db_version)

    public DBHandler(Context context){
        super(context,DB_NAME,null,DB_VERSION);

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    //todo 7 : inside onCreate create a String query to create table
    /*
       String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + DURATION_COL + " TEXT)";
    * */
    //todo 7: execute the query

    ///////////////////////////////////////////////////////////////////////////////////////////////


    //todo 8 : create a method as `addNewCourse(String courseName, courseDuration)`
    //todo 8: ---- SQLiteDatabase db = this.getWritableDatabase();
    //todo 8: ----  ContentValues values = new ContentValues();
    //todo 8: ----  values.put(NAME_COL, courseName); |  values.put(DURATION_COL, courseDuration);
    //todo 8: ----   db.insert(TABLE_NAME, null, values);
    //todo 8: ---   db.close();
    public void addNewCourse(String courseName, String courseDuration) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_COL,courseName);
        values.put(DURATION_COL, courseDuration);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + DURATION_COL + " TEXT)";
        db.execSQL(query);

    }

    //todo 9 : function to get all courses (done for you)

    public List<Map<String, String>> getAllCourses() {
        //making list of map of s,s
        List<Map<String, String>> list1 = new ArrayList<>();

        //variable to read data from db
        SQLiteDatabase db = this.getReadableDatabase();
        //query to read data
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        //cursor
        Cursor cursor = db.rawQuery(selectQuery, null);
        //looping through cursor from all rows and adding the value to a list
        if (cursor.moveToFirst()) {
            do {
                Map<String, String> map = new HashMap<>();
                String courseId = cursor.getString(0);
                String courseName = cursor.getString(1);
                String courseDuration = cursor.getString(2);
                //
                map.put("id", courseId);
                map.put("name", courseName);
                map.put("duration", courseDuration);
                //
                list1.add(map);

            } while (cursor.moveToNext());
        }

        cursor.close();

        return list1;




    }

    // todo 10  upgrade function (important for exam)
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //drops if table is existing
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }



}
