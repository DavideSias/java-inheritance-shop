package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Product {
    private int dimension;
    private boolean smartTv;

    public Television(String name, String description, BigDecimal price, BigDecimal vat, int dimension, boolean smartTv) {
        super(name, description, price, vat);
        this.dimension = dimension;
        this.smartTv = smartTv;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public String toString() {
        return "Television{" +
                "dimension=" + dimension +
                ", smartTv=" + smartTv +
                "} " + super.toString();
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (!this.smartTv) {
            BigDecimal discount = new BigDecimal("0.1");
            BigDecimal fullPrice = getFullPrice();
            BigDecimal discountValue = fullPrice.multiply(discount);
            return fullPrice.subtract(discountValue);
        } else {
            return super.getDiscountedPrice();
        }
    }
}
