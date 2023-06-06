package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] cart = new Product[3];

        /* test print products
        Smartphone iphone = new Smartphone("iphone", "smartphone apple",priceInput, vatInput, imeiInput, 32);
        Television samsung = new Television("samsung TV", "samsung tv",priceInput, vatInput, 100, true);
        Headphone sony = new Headphone("sony headphone", "headphone",priceInput, vatInput, "black", false);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(sony);*/

        for (int i = 0; i < cart.length; i++) {

            System.out.print("Che prodotto vuoi inserire? 1 - Smartphone; 2 - Tv; 3 - Cuffie: ");
            String choice = scan.nextLine();

            System.out.print("Nome prodotto: ");
            String nameInput = scan.nextLine();

            System.out.print("Descrizione prodotto: ");
            String descriptionInput = scan.nextLine();

            System.out.print("Prezzo: ");
            String priceStr = scan.nextLine();
            BigDecimal priceInput = new BigDecimal(priceStr);

            System.out.print("Iva: ");
            String vatStr = scan.nextLine();
            BigDecimal vatInput = new BigDecimal(vatStr);

            switch (choice) {
                case "1":
                    System.out.print("Codice imei: ");
                    String imeiStr = scan.nextLine();
                    BigDecimal imeiInput = new BigDecimal(imeiStr);
                    System.out.print("Memoria dispositivo: ");
                    int memoryInput = scan.nextInt();
                    cart[i] = new Smartphone(nameInput, descriptionInput, priceInput, vatInput, imeiInput, memoryInput);
                    break;
                case "2":
                    System.out.print("Dimensioni: ");
                    int dimensionInput = scan.nextInt();
                    System.out.print("Smart tv(s/n): ");
                    boolean smartInput = scan.nextLine().equalsIgnoreCase("s");
                    cart[i] = new Television(nameInput, descriptionInput, priceInput, vatInput, dimensionInput, smartInput);
                    break;
                case "3":
                    System.out.print("Colore: ");
                    String colorInput = scan.nextLine();
                    System.out.print("Wireless(s/n): ");
                    boolean wirelessInput = scan.nextLine().equalsIgnoreCase("s");
                    cart[i] = new Headphone(nameInput, descriptionInput, priceInput, vatInput, colorInput, wirelessInput);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }

        System.out.println(Arrays.toString(cart));

        scan.close();
    }
}
