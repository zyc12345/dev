package com.zyc.design_pattern.establish.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        SourceTest s = new SourceTest();
        SourceTest clone = (SourceTest)s.clone();
        System.out.println(clone.getName()==s.getName());
        System.out.println(clone.getAddress()==s.getAddress());
        System.out.println(clone.getAge()==s.getAge());
        System.out.println(s.getTest().getName());
        s.getTest().setName("=====");
        System.out.println(clone.getTest().getName());
    }
}
