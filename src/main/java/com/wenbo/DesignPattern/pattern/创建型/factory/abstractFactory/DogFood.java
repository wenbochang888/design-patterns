package com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory;

/**
 * @author changwenbo
 * @date 2024/7/3 09:52
 */
public class DogFood implements AnimalFood {
    @Override
    public void eat() {
        System.out.println("Dog is eating dog food.");
    }
}
