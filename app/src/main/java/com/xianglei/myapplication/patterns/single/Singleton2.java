package com.xianglei.myapplication.patterns.single;

/**
 *
 * 懒汉式双重校验锁（直接的懒汉就省略了，也是本人用的做多的一种）
 * @author sunxianglei
 * @date 2018/2/1
 */

public class Singleton2 {
    private volatile static Singleton2 singleton2;
    private void Singleton2(){}
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
    public void test(){
        System.out.println("我是懒汉双重校验锁式创建的单例对象");
    }
}
