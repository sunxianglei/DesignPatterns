package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class BaiduCoder implements Coder {
    @Override
    public void coding() {
        System.out.println("我是百度程序员，我擅长搜索算法");
    }
}
