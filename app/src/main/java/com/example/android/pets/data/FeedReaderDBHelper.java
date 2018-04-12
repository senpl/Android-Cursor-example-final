package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.android.pets.data.PetContract.*;

/**
 * Created by m on 23.03.18.
 */

public class FeedReaderDBHelper extends SQLiteOpenHelper{
    String dbVersion="1";
    String databaseName="pets.db";

    public FeedReaderDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

//    public FeedReaderDBHelper(SQLiteDatabase db){
////        super();
//
//    }

    public void onCreate(SQLiteDatabase db){
//        super(db);
//SQLiteDatabase dbCreate=new
        String createSql="CREATE TABLE " +
                PetEntry.TABLE_NAME +
                "("+PetEntry._ID+" INTEGER, "+PetEntry.COLUMN_PET_NAME+" TEXT, breed TEXT, gender INTEGER, weight INTEGER);";
db.execSQL(createSql);
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
//        super(db);


    }
}
