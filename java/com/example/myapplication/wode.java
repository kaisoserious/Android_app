package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class wode extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){
            finish();
            Intent intent=new Intent(mcontext,zhuyemian.class);
            startActivity(intent);
        }
        return false;
    }

    private Button Btntz_1,Btntz_2,Btntz_3,Btntz_4;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode);
        mcontext=this;
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Btntz_1= this.<Button>findViewById(R.id.wdtz_1);
        Btntz_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent= new Intent(wode.this,kechen.class);
                startActivity(intent);
            }
        });
        Btntz_2= this.<Button>findViewById(R.id.wdtz_2);
        Btntz_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(wode.this,shangcheng.class);
                startActivity(intent);
            }
        });
        Btntz_3= this.<Button>findViewById(R.id.wdtz_3);
        Btntz_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(wode.this,zhuyemian.class);
                startActivity(intent);
            }
        });
        Btntz_4= this.<Button>findViewById(R.id.wdtz_4);
        Btntz_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent= new Intent(wode.this,xiaohognshu.class);
                startActivity(intent);
            }
        });
    }
}
