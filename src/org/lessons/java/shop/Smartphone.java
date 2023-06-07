package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private BigDecimal imei;
    private int memory;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, BigDecimal imei, int memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public BigDecimal getImei() {
        return imei;
    }

    public void setImei(BigDecimal imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", memory=" + memory +
                "} " + super.toString();
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (this.memory < 32) {
            BigDecimal discount = new BigDecimal("0.05");
            BigDecimal fullPrice = getFullPrice();
            BigDecimal discountValue = fullPrice.multiply(discount);
            return fullPrice.subtract(discountValue);
        } else {
            return super.getDiscountedPrice();
        }
    }
}
