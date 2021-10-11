package com.zyc.design_pattern.establish.Builder;

import java.math.BigDecimal;

public class Product{

    private String name;

    private BigDecimal salePrice;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salePrice=" + salePrice +
                ", markerPrice=" + markerPrice +
                '}';
    }

    private BigDecimal markerPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMarkerPrice() {
        return markerPrice;
    }

    public void setMarkerPrice(BigDecimal markerPrice) {
        this.markerPrice = markerPrice;
    }
}
