package com.xianglei.myapplication.patterns.single;

/**
 * 枚举式（本人最不习惯的一种方式。。但是却是Effective Java的作者推荐的一种方式）
 * @author sunxianglei
 * @date 2018/2/1
 */

public enum Singleton4 {
    INSTANCE;
    public void test(){
        System.out.println("我是枚举创建的单例对象");
    }
}
