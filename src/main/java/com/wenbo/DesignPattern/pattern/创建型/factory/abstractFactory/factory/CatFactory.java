package com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory.factory;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory.AnimalFood;
import com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory.CatFood;

/**
 * @author changwenbo
 * @date 2024/7/3 09:53
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public AnimalFood createAnimalFood() {
        return new CatFood();
    }
}
