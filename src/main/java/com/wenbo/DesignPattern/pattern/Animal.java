package com.wenbo.DesignPattern.pattern;

import com.wenbo.DesignPattern.pattern.行为模式.visitor.AnimalVisitor;

/**
 * @author changwenbo
 * @date 2024/7/2 19:45
 */
public interface Animal {
    void speak();

    String getType();

    void accept(AnimalVisitor visitor);
}
