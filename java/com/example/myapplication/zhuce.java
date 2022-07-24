package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class zhuce extends AppCompatActivity {

    private Button mZC_1;
    private NotificationManager manager;
    private Notification notification;

    EditText name,psw;
    Button add;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);


        name=findViewById(R.id.name1);
        psw=findViewById(R.id.psw1);
        add=findViewById(R.id.Add_Info);
        final DB db = new DB(this);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        mZC_1 = this.<Button>findViewById(R.id.zc_1);
        mZC_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n =name.getText().toString();
                String p =psw.getText().toString();
                if(db.add(n,p)){
                    Toast.makeText(zhuce.this,"添加成功！！！",Toast.LENGTH_SHORT).show();
                    //跳转登陆页面
                    Intent intent = new Intent(zhuce.this,denglu.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(zhuce.this,"添加失败！账号已存在！",Toast.LENGTH_SHORT).show();
                }


            }
        });
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("leo", "测试通知",
                    NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);

        }

        notification = new NotificationCompat.Builder(this,"leo")
                .setContentTitle("运动小精灵")
                .setContentText("【运动小精灵】你的验证码是：635746。")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .build();

    }

    public void sendNotification(View view) {
        manager.notify(1,notification);
    }
}
