package com.xianglei.myapplication.patterns.single;

/**
 * 饿汉式
 * @author sunxianglei
 * @date 2018/2/1
 */

public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return singleton3;
    }
    public void test(){
        System.out.println("我是饿汉式创建的单例对象");
    }
}
