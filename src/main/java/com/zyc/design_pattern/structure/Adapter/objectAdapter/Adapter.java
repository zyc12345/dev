package com.zyc.design_pattern.structure.Adapter.objectAdapter;

public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("这是对象适配器的方法二");
    }
}
