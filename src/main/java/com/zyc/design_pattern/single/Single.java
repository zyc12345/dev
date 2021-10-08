package com.zyc.design_pattern.single;

/**
 *
 * JVM保证线程安全，防止反序列化，反之反射获取实例，因为枚举类没有构造方法，所以反射也获取不到
 */
public enum Single {
    SINGLE
}
