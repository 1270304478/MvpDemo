package com.bwie.huang.huangzhangpeng20171120.model;

import com.bwie.huang.huangzhangpeng20171120.utils.OkHttp3Utils;

import okhttp3.Callback;
/**
 * Created by huang on 2017/11/20.
 */
public class MyModel implements MyModelInterface{
   // MainInterface mInter;

     @Override
    public void getNetData(Callback callback) {
        OkHttp3Utils.doGet("https://www.zhaoapi.cn/product/getOrders?source=android&uid=71",callback);
     }
}
