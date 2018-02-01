package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class AliFactory extends CompanyFactory {

    @Override
    public Producter getProducter() {
        return new AliProducter();
    }

    @Override
    public Coder getCoder() {
        return new AliCoder();
    }
}
