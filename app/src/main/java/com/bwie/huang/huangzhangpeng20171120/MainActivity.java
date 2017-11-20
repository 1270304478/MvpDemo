package com.bwie.huang.huangzhangpeng20171120;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.bwie.huang.huangzhangpeng20171120.adapter.MyAdapter;
import com.bwie.huang.huangzhangpeng20171120.bean.GoodsBean;
import com.bwie.huang.huangzhangpeng20171120.presenter.MyPresenter;
import com.bwie.huang.huangzhangpeng20171120.view.MainInterface;

public class MainActivity extends AppCompatActivity implements MainInterface{

    MyPresenter myPresenter = new MyPresenter(this,this);
    RecyclerView recy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = (RecyclerView) findViewById(R.id.recy);
        myPresenter.getData();
    }

    @Override
    public void showView(GoodsBean bean) {
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        recy.setLayoutManager(manager);
        MyAdapter myAdapter = new MyAdapter(this,bean);
        recy.setAdapter(myAdapter);
        System.out.println("bean========="+bean);
    }
}
