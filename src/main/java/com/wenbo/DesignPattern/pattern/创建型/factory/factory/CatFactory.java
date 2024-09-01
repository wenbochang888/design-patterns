package com.wenbo.DesignPattern.pattern.创建型.factory.factory;

import com.wenbo.DesignPattern.pattern.Animal;
import com.wenbo.DesignPattern.pattern.Cat;

/**
 * @author changwenbo
 * @date 2024/7/2 19:57
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
