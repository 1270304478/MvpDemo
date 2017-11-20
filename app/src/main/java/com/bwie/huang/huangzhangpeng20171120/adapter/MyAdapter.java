package com.bwie.huang.huangzhangpeng20171120.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.bwie.huang.huangzhangpeng20171120.R;
import com.bwie.huang.huangzhangpeng20171120.bean.GoodsBean;

/**
 * Created by huang on 2017/11/20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private GoodsBean bean;
    public MyAdapter(Context context, GoodsBean bean) {

        this.context = context;
        this.bean = bean;

    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.adapter_layout,null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
       holder.price.setText(bean.getData().get(position).getPrice()+"");
       holder.status.setText(bean.getData().get(position).getStatus()+"");
        holder.time.setText(bean.getData().get(position).getCreatetime());
        holder.title.setText(bean.getData().get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return bean.getData().size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,price,time,status;
        Button btn;
        public MyViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.tv_title);
            price=itemView.findViewById(R.id.tv_price);
            status=itemView.findViewById(R.id.tv_status);
            time=itemView.findViewById(R.id.tv_time);
            btn = itemView.findViewById(R.id.btn_del);

        }
    }
}
