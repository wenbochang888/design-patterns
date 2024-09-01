package com.wenbo.DesignPattern.pattern.创建型.builder;

import com.wenbo.DesignPattern.pattern.Car;

public class BMWCarBuilder implements BaseBuilder {

    private Car car;

    public BMWCarBuilder() {
        car = new Car();
    }

    @Override
    public void buildBranch() {
        car.setBranch("BMW");
    }

    @Override
    public void buildSpeed() {
        car.setSpeed(300);
    }

    @Override
    public void buildPrice() {
        car.setPrice(3000000);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
