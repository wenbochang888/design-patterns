package com.wenbo.DesignPattern.pattern;

import com.wenbo.DesignPattern.pattern.行为模式.visitor.AnimalVisitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author changwenbo
 * @date 2024/7/2 19:46
 */
@Slf4j
public class Cat implements Animal {
    @Override
    public void speak() {
        log.info("Cat speak!");
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
