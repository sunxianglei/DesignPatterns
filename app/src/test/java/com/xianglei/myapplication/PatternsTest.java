package com.xianglei.myapplication;

import com.xianglei.myapplication.patterns.factorymethod.CarFactory;
import com.xianglei.myapplication.patterns.factorymethod.PlaneFactory;
import com.xianglei.myapplication.patterns.factorymethod.TransFactory;
import com.xianglei.myapplication.patterns.factorymethod.Transport;
import com.xianglei.myapplication.patterns.simplefactory.Animal;
import com.xianglei.myapplication.patterns.simplefactory.AnimalFactory;

import org.junit.Test;

/**
 * @author sunxianglei
 * @date 2018/1/30
 */

public class PatternsTest {

    @Test
    public void testSimpleFactory(){
        Animal animal = AnimalFactory.createAnimal(AnimalFactory.DOG);
        animal.eat();
        animal.sleep();
        animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
        animal.eat();
        animal.sleep();
    }

    @Test
    public void testFactoryMethod(){
        TransFactory factory = new PlaneFactory();
        Transport trans =  factory.createTransport();
        trans.run();
        factory = new CarFactory();
        trans = factory.createTransport();
        trans.run();
    }

}
