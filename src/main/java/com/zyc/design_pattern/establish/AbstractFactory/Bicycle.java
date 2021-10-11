package com.zyc.design_pattern.establish.AbstractFactory;

public class Bicycle extends Travel {
    @Override
    void open() {
        System.out.println("骑自行车");
    }
}
