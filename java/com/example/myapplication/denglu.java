package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class denglu extends AppCompatActivity {

    private Button mDL_1;
    private Button mDL_2;
    private Button Btn_M;
    private NotificationManager manager;
    private Notification notification;
    private EditText shuruname,shurupaswd;
    private SQLiteDatabase sqLiteDatabase;
    private Button Btn_wx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        final DB db = new DB(this);
        init();
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        mDL_1 = this.<Button>findViewById(R.id.dl_1);
        mDL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转注册页面
                Intent intent = new Intent(denglu.this, zhuce.class);
                startActivity(intent);
            }
        });
        mDL_2 = this.findViewById(R.id.dl_2);
        mDL_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = shuruname.getText().toString();
                String p = shurupaswd.getText().toString();
                if(db.add(n,p)){
                    Toast.makeText(denglu.this,"登录失败，账号未注册！！！",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(denglu.this,"登录成功！！！",Toast.LENGTH_SHORT).show();
                    //跳转主页面
                    Intent intent = new Intent(denglu.this,zhuyemian.class);
                    startActivity(intent);
                }


            }
        });

        Btn_M = this.findViewById(R.id.btn_manager);
        Btn_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转管理界面
                Intent intent = new Intent(denglu.this,Manager.class);
                startActivity(intent);
            }
        });

        //微信跳转
        Btn_wx = this.findViewById(R.id.wxbtm);
        Btn_wx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转微信
                String url11 = "weixin://";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url11)));
            }
        });

        //下拉框
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("leo", "测试通知",
                    NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);

        }

        notification = new NotificationCompat.Builder(this,"leo")
                .setContentTitle("运动小精灵")
                .setContentText("【运动小精灵】你的验证码是：121387。")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .build();




    }

    public void init(){
        shuruname = (EditText)findViewById(R.id.shuru1);
        shurupaswd = (EditText)findViewById(R.id.shuru2);
    }


    public void sendNotification(View view) {
        manager.notify(1, notification);
    }
}
