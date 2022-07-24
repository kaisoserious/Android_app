package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chongwuxiangqing extends AppCompatActivity implements View.OnClickListener{
    private Button Btn_1;
    private Button Btn_2;
    private Button Btn_3;
    private Button caomei,putao,xiangjiao,mogu,yintao,tudou,baicai,huluobu,yangcong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chongwuxiangqing);
        mcontext=this;
        //隐藏标题栏
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Btn_1= this.<Button>findViewById(R.id.xiangqing_1);//跳转主页面
        Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(chongwuxiangqing.this,zhuyemian.class);
                startActivity(intent);
            }
        });
        Btn_2= this.<Button>findViewById(R.id.xiangqing_2);//跳转宠物商店
        Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(chongwuxiangqing.this,chongwushangdian.class);
                startActivity(intent);
            }
        });
        Btn_3= this.<Button>findViewById(R.id.gwc_1);//跳转宠物商店2
        Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chongwuxiangqing.this,chongwushangdian.class);
                startActivity(intent);
            }
        });



        //喂食弹窗
        caomei=findViewById(R.id.caomei);
        caomei.setOnClickListener(this);

        putao=findViewById(R.id.putao);
        putao.setOnClickListener(this);

        xiangjiao=findViewById(R.id.xiangjiao);
        xiangjiao.setOnClickListener(this);

        mogu=findViewById(R.id.mogu);
        mogu.setOnClickListener(this);

        yintao=findViewById(R.id.yintao);
        yintao.setOnClickListener(this);

        tudou=findViewById(R.id.tudou);
        tudou.setOnClickListener(this);

        baicai=findViewById(R.id.baicai);
        baicai.setOnClickListener(this);

        huluobu=findViewById(R.id.huluobo);
        huluobu.setOnClickListener(this);

        yangcong=findViewById(R.id.yangcong);
        yangcong.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    Context mcontext;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.caomei:
                AlertDialog.Builder builder = new AlertDialog.Builder(chongwuxiangqing.this);
                builder.setTitle("草莓").setMessage("是否喂食草莓？")
                        .setIcon(R.drawable.caomei)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食草莓！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.putao:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder2.setTitle("葡萄").setMessage("是否喂食葡萄？")
                        .setIcon(R.drawable.putao)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食葡萄！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.xiangjiao:
                AlertDialog.Builder builder3 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder3.setTitle("香蕉").setMessage("是否喂食香蕉？")
                        .setIcon(R.drawable.xiangjiao)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食香蕉！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.mogu:
                AlertDialog.Builder builder4 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder4.setTitle("蘑菇").setMessage("是否喂食蘑菇？")
                        .setIcon(R.drawable.mogu)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食蘑菇！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.yintao:
                AlertDialog.Builder builder5 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder5.setTitle("樱桃").setMessage("是否喂食樱桃？")
                        .setIcon(R.drawable.yintao)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食樱桃！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.tudou:
                AlertDialog.Builder builder6 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder6.setTitle("土豆").setMessage("是否喂食土豆？")
                        .setIcon(R.drawable.jidan)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食土豆！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.baicai:
                AlertDialog.Builder builder7 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder7.setTitle("白菜").setMessage("是否喂食白菜？")
                        .setIcon(R.drawable.baicai)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食白菜！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.huluobo:
                AlertDialog.Builder builder8 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder8.setTitle("胡萝卜").setMessage("是否喂食胡萝卜？")
                        .setIcon(R.drawable.huluobo)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食胡萝卜！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;

            case R.id.yangcong:
                AlertDialog.Builder builder9 = new AlertDialog.Builder(chongwuxiangqing.this);
                builder9.setTitle("洋葱").setMessage("是否喂食洋葱？")
                        .setIcon(R.drawable.yangcong)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mcontext,"成功喂食洋葱！",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mcontext,"取消操作！",Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;
        }
    }
}
