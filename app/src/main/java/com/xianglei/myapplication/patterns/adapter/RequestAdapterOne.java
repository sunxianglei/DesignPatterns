package com.xianglei.myapplication.patterns.adapter;

/**
 * 对象适配器模式，感觉类适配器模式好怪。。就不写了
 * @author sunxianglei
 * @date 2018/2/2
 */

public class RequestAdapterOne extends RequestAdapter {

    private RequestFrame requestFrame;

    public RequestAdapterOne(RequestFrame requestFrame){
        this.requestFrame = requestFrame;
    }

    @Override
    public void request() {
        requestFrame.sendRequest();
    }
}
