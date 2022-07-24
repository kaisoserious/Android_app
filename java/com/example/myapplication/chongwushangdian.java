package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class chongwushangdian extends AppCompatActivity {
    private Button Btn_1;

    private static final String TAG ="cm" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chongwushangdian);
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        Btn_1 = this.<Button>findViewById(R.id.cwshangcheng_1);
        Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chongwushangdian.this,chongwuxiangqing.class);
                startActivity(intent);
            }
        });


    }

    public void cmClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.caomei)
                .setTitle("草莓")
                .setMessage("没有人可以拒绝一颗香香甜甜的草莓哦，小动物也不例外。\n效果：增加10%活力值。\n售价：50熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();

    }

    public void ptClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.putao)
                .setTitle("葡萄")
                .setMessage("爱美的小动物都爱吃。\n效果：增加10%活力值。\n售价：50熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void xjClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.xiangjiao)
                .setTitle("香蕉")
                .setMessage("动物们吃了都会忍不住噗噗。\n效果：增加5%活力值。\n售价：30熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void mgClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.mogu)
                .setTitle("蘑菇")
                .setMessage("营养价值超高，小熊最爱蘑菇炖鸡面。\n效果：增加10%活力值。\n售价：50熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void ytClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.yintao)
                .setTitle("樱桃")
                .setMessage("红丝绒樱桃蛋糕是小熊猫最爱吃的甜品。\n效果：增加20%活力值。\n售价：90熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void jdClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.jidan)
                .setTitle("鸡蛋")
                .setMessage("蛋白质UP！UP！！UP！！！\n效果：增加10%活力值。\n售价：50熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void bcClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.baicai)
                .setTitle("大白菜")
                .setMessage("妈妈说多吃蔬菜！\n效果：增加5%活力值。\n售价：30熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void lbClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.huluobo)
                .setTitle("胡萝卜")
                .setMessage("增强免疫力，晚上看的更清楚！\n效果：增加5%活力值。\n售价：30熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void ycClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.yangcong)
                .setTitle("洋葱")
                .setMessage("是每次切开都会忍不住流眼泪的神奇蔬菜。\n效果：增加10%活力值。\n售价：50熊猫币")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了购买" );

                    }
                })
                .create()
                .show();
    }

    public void gzClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.tu1)
                .setTitle("兑换规则")
                .setMessage("用户可以通过每天的运动步数兑换熊猫币。\n熊猫币不可以充值\n兑换比例：1000步=1枚熊猫币\n\n\n(兑换比例：1000步=1熊猫币)\n\n\n")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了确定" );

                    }
                })
                .create()
                .show();
    }

    public void dhClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.tu1)
                .setTitle("熊猫币兑换")
                .setMessage("兑换：__________ 个熊猫币\n\n（兑换比例：1000步=1枚熊猫币）")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了取消" );

                    }
                })
                .setNegativeButton("兑换", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e(TAG, "onClick: 点击了兑换" );

                    }
                })
                .create()
                .show();
    }
}
