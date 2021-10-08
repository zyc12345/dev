package com.zyc.design_pattern.single;

public class TestEnumSingle {

    public static void main(String[] args) {
        Single single = Single.SINGLE;
        Single single1 = Single.SINGLE;
        System.out.println("输出结果=="+(single1==single));
    }
}
