package com.zyc.design_pattern.structure.Decorator;

public class Dog extends Animal{
    @Override
    void eat() {
        this.name = "一个大黄狗";
        System.out.println("吃狗粮的狗~");
    }
}
