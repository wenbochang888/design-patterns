package com.wenbo.DesignPattern.pattern.创建型.builder;

import com.wenbo.DesignPattern.pattern.Car;

public interface BaseBuilder {

    void buildBranch();

    void buildSpeed();

    void buildPrice();

    Car getCar();

}
