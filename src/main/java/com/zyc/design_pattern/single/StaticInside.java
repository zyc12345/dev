package com.zyc.design_pattern.single;


/**
 * 静态内部类中实例化一个静态的外部类实例，静态内部类也只是被加载一次
 */
public class StaticInside {

    private StaticInside(){};

    private static class Holder{
        private static final StaticInside staticInside = new StaticInside();
    }

    public StaticInside getInstance(){
        return Holder.staticInside;
    }
}
