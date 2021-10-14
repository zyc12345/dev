package com.zyc.design_pattern.structure.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {


    public static void main(String[] args) {
        //静态工厂
//        DogProxy dogProxy = new DogProxy(new Dog());
//        dogProxy.call();

        //动态工厂
        Dog dog = new Dog();
        Roar d = (Roar)Proxy.newProxyInstance(Dog.class.getClassLoader(), new Class[]{Roar.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("start");
                Object invoke = method.invoke(dog, args);
                System.out.println("end");
                return invoke;
            }
        });
        d.call();
    }


}

class Dog implements Roar{
    @Override
    public void call() {
        System.out.println("汪汪汪~");
    }
}


class DogProxy implements Roar{

    Roar roar;

    public DogProxy(Roar roar) {
        this.roar = roar;
    }

    @Override
    public void call() {
        System.out.println("start");
        roar.call();
        System.out.println("end");
    }
}


interface Roar{
 void call();
}