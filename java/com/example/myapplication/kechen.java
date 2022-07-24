package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class kechen extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){
            finish();
            Intent intent=new Intent(mcontext,zhuyemian.class);
            startActivity(intent);
        }
        return false;
    }
    private Button Btn_1;
    private Button Btn_2;
    private Button Btn_3;
    private Button Btn_4;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kechen);

        mcontext=this;
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Btn_1= this.<Button>findViewById(R.id.kctz_1);//跳转商城
        Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(kechen.this,shangcheng.class);
                startActivity(intent);

            }
        });

        Btn_2= this.<Button>findViewById(R.id.kctz_2);//跳转主页面
        Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(kechen.this,zhuyemian.class);
                startActivity(intent);
            }
        });
        Btn_3= this.<Button>findViewById(R.id.kctz_3);//跳转朋友圈
        Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(kechen.this,xiaohognshu.class);
                startActivity(intent);
            }
        });
        Btn_4= this.<Button>findViewById(R.id.kctz_4);//跳转我的
        Btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(kechen.this,wode.class);
                startActivity(intent);
            }
        });
    }
}
