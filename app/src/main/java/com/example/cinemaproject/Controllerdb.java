package com.example.cinemaproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class Controllerdb  extends SQLiteOpenHelper {

    public static  final  String DATABASE_NAME = "DB"; // name of DB
    public Controllerdb(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query1 , query2  ;

        query1 = " CREATE TABLE IF NOT EXISTS users (username  VARCHAR PRIMARY KEY , pass VSRCHAR);";
        db.execSQL(query1);

        query2 = " CREATE TABLE IF NOT EXISTS newuser (Id INTEGER PRIMARY KEY AUTOINCREMENT , Name VARCHAR , phone VSRCHAR);";
        db.execSQL(query2);

    }// end method onCreate

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query1 ,  query2  ;
        query1 = "DROP TABLE IF EXISTS users";
        db.execSQL(query1);
        query2 = "DROP TABLE IF EXISTS users";
        db.execSQL(query2);
        onCreate(db);

    } // end methodonUpgrade
} // end class
