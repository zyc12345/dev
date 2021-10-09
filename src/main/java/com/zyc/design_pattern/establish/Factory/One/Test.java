package com.zyc.design_pattern.establish.Factory.One;

import com.zyc.design_pattern.establish.Factory.Open;

public class Test {

    public static void main(String[] args) {
        BicycleFactory bicycleFactory = new BicycleFactory();
        Open open = bicycleFactory.create();
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        Open open1 = motorcycleFactory.create();
        open.open();
        open1.open();
    }
}
