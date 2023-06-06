package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product{
    private String color;
    private boolean wireless;

    public Headphone(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                "} " + super.toString();
    }
}
