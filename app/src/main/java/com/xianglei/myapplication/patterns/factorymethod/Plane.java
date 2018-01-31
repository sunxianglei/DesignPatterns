package com.xianglei.myapplication.patterns.factorymethod;

/**
 * @author sunxianglei
 * @date 2018/1/30
 */

public class Plane implements Transport {
    @Override
    public void run() {
        System.out.println("plane is flying");
    }
}
