package com.zyc.design_pattern.structure.Decorator;

public class ColourDecorator extends AnimalDecorator{

    ColourDecorator(Animal animal){
        this.animal = animal;
    }

    @Override
    void decorator() {
        animal.eat();
        System.out.print(" 涂上颜色");
    }
}
