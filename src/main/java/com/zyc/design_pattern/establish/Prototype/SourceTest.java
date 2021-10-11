package com.zyc.design_pattern.establish.Prototype;

public class SourceTest implements Cloneable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;

    private String address;

    private Integer age;

    public TargetTest getTest() {
        return test;
    }

    public void setTest(TargetTest test) {
        this.test = test;
    }

    private TargetTest test = new TargetTest(1,"测试");

    @Override
    public Object clone() throws CloneNotSupportedException {
        SourceTest clone = (SourceTest)super.clone();
        TargetTest targetTest = (TargetTest)test.clone();
        clone.setTest(targetTest);
        return clone;
    }
}
