package com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory.factory;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.创建型.factory.abstractFactory.AnimalFood;

/**
 * @author changwenbo
 * @date 2024/7/3 09:52
 */
public interface AnimalFactory {
    Animal createAnimal();
    AnimalFood createAnimalFood();
}
