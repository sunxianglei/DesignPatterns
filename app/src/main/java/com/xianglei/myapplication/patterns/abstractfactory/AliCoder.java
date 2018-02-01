package com.xianglei.myapplication.patterns.abstractfactory;

/**
 * @author sunxianglei
 * @date 2018/1/31
 */

public class AliCoder implements Coder {

    @Override
    public void coding() {
        System.out.println("我是阿里程序员，我擅长双十一百万用户并发");
    }
}
