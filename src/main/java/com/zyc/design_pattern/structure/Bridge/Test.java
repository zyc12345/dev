package com.zyc.design_pattern.structure.Bridge;

public class Test {
    public static void main(String[] args) {
        // 甜的香蕉
        Fruits fruits = new Banana(new Sweet());
        fruits.display();
        // 酸的香蕉
        Fruits fruits1 = new Banana(new Acid());
        fruits.display();
    }
}
