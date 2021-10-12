package com.zyc.design_pattern.structure.Decorator;

public class Test {

    public static void main(String[] args) {
        AnimalDecorator animalDecorator = new ColourDecorator(new Dog());
        animalDecorator.decorator();
    }
}
