package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class xiaohognshu extends AppCompatActivity {
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
        setContentView(R.layout.activity_xiaohognshu);
        mcontext=this;
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Btn_1= this.<Button>findViewById(R.id.hstz_1);//跳转课程
        Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent= new Intent(xiaohognshu.this,kechen.class);
                startActivity(intent);
            }
        });
        Btn_2= this.<Button>findViewById(R.id.hstz_2);//跳转商城
        Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(xiaohognshu.this,shangcheng.class);
                startActivity(intent);
            }

        });
        Btn_3= this.<Button>findViewById(R.id.hstz_3);//跳转主页面
        Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(xiaohognshu.this,zhuyemian.class);
                startActivity(intent);
            }
        });
        Btn_4= this.findViewById(R.id.hstz_4);//跳转wode
        Btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(xiaohognshu.this,wode.class);
                startActivity(intent);
            }
        });
    }

}
