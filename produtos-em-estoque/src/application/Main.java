package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();


        System.out.println("Name: ");
        p.name = sc.next();
        System.out.println("Price: ");
        p.price = sc.nextDouble();
        System.out.println("Quantity: ");
        p.quantity = sc.nextInt();

        System.out.println("Product data: " + p);

        System.out.println("Enter the number of products to be added in stock: ");
        int quant = sc.nextInt();
        p.addProducts(quant);
        System.out.println("Update data: " + p);

        System.out.println("Enter the number of products to be removed from stock: ");
        quant = sc.nextInt();
        p.removeProducts(quant);
        System.out.println("Update data: " + p);



    }
}