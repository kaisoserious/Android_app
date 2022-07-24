package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class zhuyemian extends AppCompatActivity {
    private RadioButton Rbtn_3;
    private RadioButton Rbtn_4;
    private Button Rbtnzym_tz1;
    private Button Rbtnzym_tz2;
    private Button Rbtnzym_tz3,Rbtnzym_tz4,Rbtnzym_tz5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuyemian);

        Rbtnzym_tz3 = this.<Button>findViewById(R.id.zymtz_1);
        Rbtnzym_tz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(zhuyemian.this,kechen.class);
                startActivity(intent);
            }
        });
        Rbtnzym_tz4 = this.<Button>findViewById(R.id.zymtz_2);
        Rbtnzym_tz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(zhuyemian.this,shangcheng.class);
                startActivity(intent);
            }
        });
        Rbtnzym_tz5 = this.<Button>findViewById(R.id.zymtz_3);
        Rbtnzym_tz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(zhuyemian.this,wode.class);
                startActivity(intent);
            }
        });

        Rbtnzym_tz2= this.<Button>findViewById(R.id.tzxm_1);//宠物详情
        Rbtnzym_tz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(zhuyemian.this,chongwuxiangqing.class);
                startActivity(intent);
            }
        });
        Rbtnzym_tz1= this.<Button>findViewById(R.id.zym_tiaozhuan1);//跳转朋友圈
        Rbtnzym_tz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(zhuyemian.this,xiaohognshu.class);
                startActivity(intent);

            }
        });
//广播

        Rbtn_3= this.<RadioButton>findViewById(R.id.zym_3);
        Rbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(zhuyemian.this,"你已经完成了今日目标",Toast.LENGTH_SHORT)

                        .show();

            }
        });
        Rbtn_4 = this.<RadioButton>findViewById(R.id.zym_4);
        Rbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(zhuyemian.this,"你已经完成了今日目标",Toast.LENGTH_SHORT)

                        .show();
            }
        });



        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }


    }


@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.add:
                Toast.makeText(zhuyemian.this,"增加",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
//AlertDialog
    public void leoClick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.tubiao)
                .setTitle("宠物信息")
                .setMessage("姓名：小熊猫\n健康值：78%\n饥饿值：50%")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create()
                .show();






    }

}
