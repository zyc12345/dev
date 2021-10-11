package com.zyc.design_pattern.establish.Builder;

public class Test {

    public static void main(String[] args) {
        BuilderTestProduct builderProduct = new BuilderTestProduct();
        Product product = builderProduct.buildOne().buildTwo().buildThree().getProduct();
        System.out.println(product);
    }
}
