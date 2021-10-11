package com.zyc.design_pattern.establish.AbstractFactory;

public class SpecificAncientFactory extends ModernAbstractFactory{
    @Override
    Eat eat() {
        return new Rice();
    }

    @Override
    Travel open() {
        return new Bicycle();
    }
}
