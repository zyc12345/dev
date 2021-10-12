package com.zyc.design_pattern.structure.Decorator;

public class Cat extends Animal{
    @Override
    void eat() {
        this.name = "一个大花猫";
        System.out.println("吃猫粮的猫~");
    }
}
