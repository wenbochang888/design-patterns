package com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory;

/**
 * @author changwenbo
 * @date 2024/7/3 09:52
 */
public class CatFood implements AnimalFood {
    @Override
    public void eat() {
        System.out.println("Cat is eating cat food.");
    }
}
