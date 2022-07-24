package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


import static android.os.Build.VERSION.SDK_INT;

public class Manager extends AppCompatActivity {

    EditText name, psw;
    Button add, del, change, seeAll;
    TextView usersinfo;
    private String ip = "192.168.214.116";
    private int port = 2022;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        mcontext = this;

        //Socket通信
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        init();


        name = findViewById(R.id.name);
        psw = findViewById(R.id.psw);
        add = findViewById(R.id.Add_Info);
        del = findViewById(R.id.del);
        change = findViewById(R.id.change);
        seeAll = findViewById(R.id.seeAll);
        usersinfo = findViewById(R.id.usersInfo);
        final DB db = new DB(this);

        //添加用户
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String p = psw.getText().toString();
                if (db.add(n, p)) {
                    Toast.makeText(Manager.this, "添加成功！！！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Manager.this, "添加失败！账号已存在！", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //删除用户
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String p = psw.getText().toString();
                if (db.del(n)) {
                    Toast.makeText(Manager.this, "删除成功！！！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Manager.this, "删除失败！请检查账号输入是否正确", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //修改用户（根据用户名修改）
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String p = psw.getText().toString();
                if (db.change(n, p)) {
                    Toast.makeText(Manager.this, "修改成功！！！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Manager.this, "修改失败！请检查账号输入是否正确", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //查询所有用户
        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usersinfo.setText("");//查询所有用户，需要先清空一下内容
                ArrayList a = db.getAll();
                for (Object b :
                        a) {
                    String n = usersinfo.getText().toString();
                    String str = n + ((User) b).toString() + "\n";
                    usersinfo.setText(str);
                }
                Toast.makeText(Manager.this, "查询数据成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        Button send = findViewById(R.id.send);
        final EditText mes = findViewById(R.id.mes);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String r = mes.getText().toString();
                    if (!TextUtils.isEmpty(r)) {
                        Toast.makeText(mcontext, "意见反馈成功！", Toast.LENGTH_SHORT).show();
                        final String msg = mes.getText().toString();
                        new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Socket s = new Socket(ip, port);
                                    OutputStream os = s.getOutputStream();
                                    os.write(msg.getBytes("utf-8"));

                                    InputStream is = s.getInputStream();
                                    byte[] bys = new byte[1024];
                                    int len = is.read(bys);
                                    String s1 = new String(bys, 0, len);

                                    Looper.prepare();
                                    Toast.makeText(mcontext, s1, Toast.LENGTH_SHORT).show();
                                    Looper.loop();

                                    os.close();
                                    is.close();
                                } catch (UnknownHostException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }.start();

                    } else {
                        Toast.makeText(Manager.this, "请先输入内容", Toast.LENGTH_SHORT).show();
                        mes.requestFocus();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}