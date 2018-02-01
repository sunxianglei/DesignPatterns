package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class AliProducter implements Producter {

    @Override
    public void designProduct() {
        System.out.println("我是阿里产品经理，我擅长淘宝产品的设计");
    }
}
