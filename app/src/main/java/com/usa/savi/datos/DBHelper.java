package com.usa.savi.datos;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqLiteDatabase;

    public DBHelper(Context context) {
        super(context, "reto3.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PRODUCTOS(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name VARCHAR," +
                "description VARCHAR," +
                "price VARCHAR," +
                "image BLOB" +
                ")");
        db.execSQL("CREATE TABLE SERVICIOS(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name VARCHAR," +
                "description VARCHAR," +
                "price VARCHAR," +
                "image BLOB" +
                ")");
        db.execSQL("CREATE TABLE SURCUSARLES(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name VARCHAR," +
                "description VARCHAR," +
                "location VARCHAR," +
                "image BLOB" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS PRODUCTOS");
        db.execSQL("DROP TABLE IF EXISTS SERVICIOS");
        db.execSQL("DROP TABLE IF EXISTS SURCURSALES");
    }

    // Metodos Propios...

    public void insertData(String campo1, String campo2, String campo3, byte[] image, String table){
        String sql ="INSERT INTO "+ table +" SURCURSALES VALUES (null, ?, ?, ?, ?)";
        SQLiteStatement statement = sqLiteDatabase.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1, campo1);
        statement.bindString(1, campo2);
        statement.bindString(1, campo3);
        statement.bindBlob(1, image);

        statement.executeInsert();
    }

    public Cursor getData(String table){
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM"+table, null);
        return cursor;
    }

}
