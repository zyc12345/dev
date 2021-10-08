package com.zyc.design_pattern.establish.Singleton;

/**
 * 懒汉式，初始化默认是null，当真正进行获取实例的时候判断null新增，非null则直接返回。
 * 问题：在多线程情况下会导致创建多个实例
 */
public class LazyMan {

    private static LazyMan lazyMan = null;

    private LazyMan(){};

    public LazyMan getInstance(){
        if (lazyMan==null){
            return new LazyMan();
        }
        return lazyMan;
    }

}


/**
 * 改版1：多线程有问题那就加锁标识，synchronized，可以解决问题。
 * 问题：锁的范围太大了，第一个线程进来new成功之后，后面的线程最好是直接获取返回就好，但是加了锁，多了锁竞争的时间。
 */
class LazyMan1 {

    private static LazyMan1 lazyMan1 = null;

    private LazyMan1(){};

    public synchronized LazyMan1 getInstance(){
        if (lazyMan1==null){
            return new LazyMan1();
        }
        return lazyMan1;
    }

}

/**
 * 改版2：缩小了锁的范围。
 * 问题：在多线程下还是有问题
 */
class LazyMan2{
    private static LazyMan2 lazyMan2 = null;

    private LazyMan2(){};

    public LazyMan2 getInstance(){
        if (lazyMan2==null){
            synchronized (LazyMan2.class){
              return new LazyMan2();
            }
        }
        return lazyMan2;
    }
}

/**
 * 改版3：在锁内部代码也进行空判断，DCL：双重检查
 */
class LazyMan3{
    private static LazyMan3 lazyMan3 = null;

    private LazyMan3(){};

    public LazyMan3 getInstance(){
        if (lazyMan3==null){
            synchronized (LazyMan3.class){
                if (lazyMan3==null){
                    return new LazyMan3();
                }
            }
        }
        return lazyMan3;
    }
}


