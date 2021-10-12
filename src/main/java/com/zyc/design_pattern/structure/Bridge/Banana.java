package com.zyc.design_pattern.structure.Bridge;

public class Banana extends Fruits{

   public Banana(FruitsImpl fruits1){
        this.fruits =fruits1;
    }

    public void display(){
        fruits.display();
        System.out.println("香蕉");
    }
}
