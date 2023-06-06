package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Product{
    private int dimension;
    private boolean smartTv;

    public Television(String name, String description, BigDecimal price, BigDecimal vat, int dimension, boolean smartTv) {
        super(name, description, price, vat);
        this.dimension = dimension;
        this.smartTv = smartTv;
    }

    @Override
    public String toString() {
        return "Television{" +
                "dimension=" + dimension +
                ", smartTv=" + smartTv +
                "} " + super.toString();
    }
}
