package com.zyc.design_pattern.establish.Factory.Two;

import com.zyc.design_pattern.establish.Factory.Open;

public class Test {

    public static void main(String[] args) {
        OpenFactory openFactory = new MotorcycleFactory();
        Open open = openFactory.create();
        OpenFactory openFactory1 = new BicycleFactory();
        Open open1 = openFactory1.create();
        open.open();
        open1.open();
    }
}
