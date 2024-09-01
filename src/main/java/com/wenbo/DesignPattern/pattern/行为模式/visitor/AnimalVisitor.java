package com.wenbo.DesignPattern.pattern.行为模式.visitor;

import com.wenbo.DesignPattern.pattern.Cat;
import com.wenbo.DesignPattern.pattern.Dog;

/**
 * @author changwenbo
 * @date 2024/8/5 17:35
 */
public interface AnimalVisitor {
    void visit(Dog dog);

    void visit(Cat cat);
}

