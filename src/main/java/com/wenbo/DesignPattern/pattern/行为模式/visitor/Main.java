package com.wenbo.DesignPattern.pattern.行为模式.visitor;

import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;
import lombok.extern.slf4j.Slf4j;

/**
 * @author changwenbo
 * @date 2024/8/5 19:02
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        AnimalStructure animalStructure = new AnimalStructure();
        animalStructure.addAnimal(new Dog());
        animalStructure.addAnimal(new Cat());

        // 使用声音访问者
        AnimalVisitor soundVisitor = new AnimalSoundVisitor();
        animalStructure.accept(soundVisitor);

        System.out.println("====================");

        // 使用年龄访问者
        AnimalVisitor ageVisitor = new AnimalAgeVisitor();
        animalStructure.accept(ageVisitor);
    }
}