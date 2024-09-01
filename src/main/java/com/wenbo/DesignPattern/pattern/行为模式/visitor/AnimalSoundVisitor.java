package com.wenbo.DesignPattern.pattern.行为模式.visitor;

import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;
import lombok.extern.slf4j.Slf4j;

/**
 * @author changwenbo
 * @date 2024/8/5 17:36
 */
@Slf4j
public class AnimalSoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        dog.speak();  // 调用 Dog 类的方法
        log.info("Dog barks!");
    }

    @Override
    public void visit(Cat cat) {
        cat.speak();  // 调用 Cat 类的方法
        log.info("Cat meows!");
    }
}


