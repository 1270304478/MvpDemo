package com.bwie.huang.huangzhangpeng20171120.presenter;

import android.content.Context;
import android.util.Log;

import com.bwie.huang.huangzhangpeng20171120.bean.GoodsBean;
import com.bwie.huang.huangzhangpeng20171120.model.MyModel;
import com.bwie.huang.huangzhangpeng20171120.utils.OnUiCallback;
import com.bwie.huang.huangzhangpeng20171120.view.MainInterface;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.Call;
/**
 * Created by huang on 2017/11/20.
 */
public class MyPresenter {
    Context context;
   MainInterface mInter;
    MyModel model;
    public MyPresenter(Context context, MainInterface mInter) {
        this.context = context;
       this.mInter = mInter;
        model = new MyModel();
    }
    public void getData(){
        model.getNetData(new OnUiCallback() {
            @Override
            public void onFailed(Call call, IOException e) {

            }
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                GoodsBean bean = gson.fromJson(result, GoodsBean.class);
                Log.i("==========", "onSuccess: "+bean);
                mInter.showView(bean);
            }
        });
    }
}
