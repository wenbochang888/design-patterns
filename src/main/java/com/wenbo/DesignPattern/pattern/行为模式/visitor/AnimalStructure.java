package com.wenbo.DesignPattern.pattern.行为模式.visitor;

import com.wenbo.DesignPattern.pattern.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author changwenbo
 * @date 2024/8/5 19:07
 */
public class AnimalStructure {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void accept(AnimalVisitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}