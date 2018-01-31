package com.xianglei.myapplication.patterns.simplefactory;

/**
 * @author sunxianglei
 * @date 2018/1/30
 */

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }
}
