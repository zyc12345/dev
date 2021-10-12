package com.zyc.design_pattern.structure.Bridge;

public class Apple extends Fruits{
    public Apple(FruitsImpl fruits1){
        this.fruits = fruits1;
    }

    public void display(){
        fruits.display();
        System.out.print("苹果");
    }
}
