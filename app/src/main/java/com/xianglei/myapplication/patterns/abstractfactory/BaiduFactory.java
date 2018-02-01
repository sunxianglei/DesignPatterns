package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class BaiduFactory extends CompanyFactory {

    @Override
    public Producter getProducter() {
        return new BaiduProducter();
    }

    @Override
    public Coder getCoder() {
        return new BaiduCoder();
    }
}
