package com.zyc.design_pattern.establish.AbstractFactory;
// 具体工厂
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
