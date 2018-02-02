package com.xianglei.myapplication;

import com.xianglei.myapplication.patterns.abstractfactory.AliFactory;
import com.xianglei.myapplication.patterns.abstractfactory.BaiduFactory;
import com.xianglei.myapplication.patterns.abstractfactory.Coder;
import com.xianglei.myapplication.patterns.abstractfactory.CompanyFactory;
import com.xianglei.myapplication.patterns.abstractfactory.Producter;
import com.xianglei.myapplication.patterns.adapter.RequestAdapter;
import com.xianglei.myapplication.patterns.adapter.RequestAdapterOne;
import com.xianglei.myapplication.patterns.adapter.RequestFrame;
import com.xianglei.myapplication.patterns.builder.Person;
import com.xianglei.myapplication.patterns.factorymethod.CarFactory;
import com.xianglei.myapplication.patterns.factorymethod.PlaneFactory;
import com.xianglei.myapplication.patterns.factorymethod.TransFactory;
import com.xianglei.myapplication.patterns.factorymethod.Transport;
import com.xianglei.myapplication.patterns.simplefactory.Animal;
import com.xianglei.myapplication.patterns.simplefactory.AnimalFactory;
import com.xianglei.myapplication.patterns.single.Singleton1;
import com.xianglei.myapplication.patterns.single.Singleton2;
import com.xianglei.myapplication.patterns.single.Singleton3;
import com.xianglei.myapplication.patterns.single.Singleton4;

import org.junit.Test;
import org.junit.runner.Request;

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

    @Test
    public void testAbstractFactory(){
        CompanyFactory factory = new AliFactory();
        Coder coder = factory.getCoder();
        Producter producter = factory.getProducter();
        coder.coding();
        producter.designProduct();

        factory = new BaiduFactory();
        coder = factory.getCoder();
        producter = factory.getProducter();
        coder.coding();
        producter.designProduct();
    }

    @Test
    public void testBuilder(){
//        Person person = new Person.Builder("sun").setAge(22).setSex(Person.WOMAN).build();
        Person.Builder builder = new Person.Builder("sun");
        Person person = builder.setAge(22)
                .setSex(Person.WOMAN)
                .build();
        System.out.println("姓名：" + person.getName() + "\n性别：" + person.getSex() + "\n年龄：" + person.getAge());
    }

    @Test
    public void testSingleton(){
        Singleton1.getInstance().test();
        Singleton2.getInstance().test();
        Singleton3.getInstance().test();
        Singleton4.INSTANCE.test();
    }

    @Test
    public void testAdapter(){
        RequestFrame requestFrame = new RequestFrame();
        RequestAdapter requestAdapter = new RequestAdapterOne(requestFrame);
        requestAdapter.request();
    }

}
