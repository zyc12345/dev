package com.zyc.design_pattern.structure.Adapter.classAdapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public void method2() {
        System.out.println("这是方法二");
    }
}
