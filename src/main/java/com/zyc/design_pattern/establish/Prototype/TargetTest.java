package com.zyc.design_pattern.establish.Prototype;

public class TargetTest implements Cloneable{

    private Integer salePrice;

    public TargetTest(Integer salePrice, String name) {
        this.salePrice = salePrice;
        this.name = name;
    }

    private String name;

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
