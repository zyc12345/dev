package com.zyc.design_pattern.establish.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        ModernAbstractFactory m = new SpecificAncientFactory();
        Travel open = m.open();
        Eat eat = m.eat();
        open.open();
        eat.eat();
    }
}
