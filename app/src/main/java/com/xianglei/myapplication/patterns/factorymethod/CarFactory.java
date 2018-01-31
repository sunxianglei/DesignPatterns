package com.xianglei.myapplication.patterns.factorymethod;

/**
 * @author sunxianglei
 * @date 2018/1/30
 */

public class CarFactory extends TransFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
