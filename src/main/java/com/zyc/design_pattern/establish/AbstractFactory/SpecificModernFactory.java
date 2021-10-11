package com.zyc.design_pattern.establish.AbstractFactory;

public class SpecificModernFactory extends ModernAbstractFactory{
    @Override
    Eat eat() {
        return new Noodles();
    }

    @Override
    Travel open() {
        return new Motorcycle();
    }
}
