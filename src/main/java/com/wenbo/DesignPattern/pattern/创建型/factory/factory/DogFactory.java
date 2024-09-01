package com.wenbo.DesignPattern.pattern.创建型.factory.factory;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.Dog;

/**
 * @author changwenbo
 * @date 2024/7/2 19:57
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
