package com.xianglei.myapplication.patterns.simplefactory;

/**
 * @author sunxianglei
 * @date 2018/1/30
 */

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }
}
