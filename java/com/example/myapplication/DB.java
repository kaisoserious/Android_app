package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DB extends SQLiteOpenHelper {
    public DB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    private SQLiteDatabase dp;
    public DB(Context context){
        super(context,"TEST1.dp",null,1);
        dp=this.getWritableDatabase();
    }
    //添加操作
    public boolean add(String name,String psw){
        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("psw",psw);
        long i = dp.insert("users",null,values);
        if(i>0){
            Log.d("系统提示","添加成功");
            return true;
        }
        return false;
    }
    //删除操作
    public boolean del(String name){
        long i = dp.delete("users","name=?",new String[]{name});
        if(i>0){
            Log.d("系统提示","删除成功");
            return true;
        }
        return false;
    }
    //修改操作
    public boolean change(String name,String NewPsw){
        ContentValues values = new ContentValues();
        values.put("psw",NewPsw);
        long i = dp.update("users",values,"name=?",new String[]{name});
        if(i>0){
            Log.d("系统提示","修改成功");
            return true;
        }
        return false;
    }
    //查询操作
    public ArrayList getAll(){
        ArrayList array = new ArrayList();
        Cursor cursor=dp.query("users",null,null,null,null,null,null);
        while (cursor.moveToNext()){
            @SuppressLint("Range") String name=cursor.getString(cursor.getColumnIndex("name"));
            @SuppressLint("Range") String psw=cursor.getString(cursor.getColumnIndex("psw"));
            User u = new User(name,psw);
            array.add(u);
        }
        return array;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table users(name text primary key,psw text not null)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
