package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{
    private BigDecimal imei;
    private int memory;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, BigDecimal imei, int memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", memory=" + memory +
                "} " + super.toString();
    }
}
