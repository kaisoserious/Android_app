package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class shangcheng extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){
            finish();
            Intent intent=new Intent(mcontext,zhuyemian.class);
            startActivity(intent);
        }
        return false;
    }
    private Button Btntz_1;
    private Button Btntz_2;
    private Button Btntz_3;
    private Button Btntz_4;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shangcheng);
        mcontext=this;
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Btntz_1= this.<Button>findViewById(R.id.sctz_1);
        Btntz_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(shangcheng.this,kechen.class);
                startActivity(intent);
            }
        });
        Btntz_2= this.<Button>findViewById(R.id.sctz_2);
        Btntz_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(shangcheng.this,zhuyemian.class);
                startActivity(intent);
            }
        });
        Btntz_3= this.<Button>findViewById(R.id.sctz_3);
        Btntz_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(shangcheng.this,xiaohognshu.class);
                startActivity(intent);
            }
        });
        Btntz_4= this.findViewById(R.id.sctz_4);
        Btntz_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent= new Intent(shangcheng.this,wode.class);
                startActivity(intent);
            }
        });
    }
}
