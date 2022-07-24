package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTestView;
    private Button mBtnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }





        mBtnTestView = this.<Button>findViewById(R.id.btn_textview);
        mBtnTestView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转TextView登录界面
                Intent intent = new Intent(MainActivity.this, denglu.class);
                startActivity(intent);
            }
        });
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转注册页面
                Intent intent = new Intent(MainActivity.this,zhuce.class);
                startActivity(intent);
            }
        });

    }
}
