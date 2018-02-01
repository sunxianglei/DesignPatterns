package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class BaiduProducter implements Producter {
    @Override
    public void designProduct() {
        System.out.println("我是百度产品经理，我擅长什么呢。。。");
    }
}
