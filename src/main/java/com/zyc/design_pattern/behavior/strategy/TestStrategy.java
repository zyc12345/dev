package com.zyc.design_pattern.behavior.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.changeSuit(PrincessSuit.getInstance());
        girl.changeSuit(SchoolUniformSuit.getInstance());
    }
}
