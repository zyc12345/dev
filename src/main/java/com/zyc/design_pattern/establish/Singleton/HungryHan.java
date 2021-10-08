package com.zyc.design_pattern.establish.Singleton;

/**
 * 饿汉式单例，jvm保证线程安全，静态变量只会被加载一次
 * 优点：简单好用
 * 缺点：不管是否使用都会初始化对象，会造成资源浪费。
 */
public class HungryHan {

    private static HungryHan hungryHan = new HungryHan();

    // 私有化构造方法
    private HungryHan(){}

    public HungryHan getInstance(){
        return hungryHan;
    }
}
