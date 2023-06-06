package org.lessons.java.shop;
import java.math.BigDecimal;

public class Cart {
    public static void main(String[] args) {
    BigDecimal priceInput = new BigDecimal(100);
    BigDecimal vatInput = new BigDecimal(22);
    BigDecimal imeiInput = new BigDecimal(1501235646);

        Smartphone iphone = new Smartphone("iphone", "smartphone apple",priceInput, vatInput, imeiInput, 32);
        Television samsung = new Television("samsung TV", "samsung tv",priceInput, vatInput, 100, true);
        Headphone sony = new Headphone("sony headphone", "headphone",priceInput, vatInput, "black", false);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(sony);
    }
}
