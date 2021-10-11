package com.zyc.design_pattern.establish.Builder;

import java.math.BigDecimal;

public class BuilderTestProduct implements BuilderTest {
    public Product product = new Product();
    @Override
    public BuilderTest buildOne() {
        product.setName("商品名字");
        return this;
    }

    @Override
    public BuilderTest buildTwo() {
        product.setSalePrice(BigDecimal.ONE);
        return this;
    }

    @Override
    public BuilderTest buildThree() {
        product.setMarkerPrice(BigDecimal.TEN);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
