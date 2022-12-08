package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Price: ");
        Double price = sc.nextDouble();


        //como temos um constructor, como o valor não pode ser vazio, precisa inserir os dados antes de instanciar a classe
        Product p = new Product(name, price); //ativa o construtor
        p.setName("TV");
        System.out.println();
        System.out.println("Update name: " + p.getName());
        p.setPrice(1000.00);
        System.out.println("Update price: " + p.getPrice());
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