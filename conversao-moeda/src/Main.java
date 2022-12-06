import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        Double dollarPrice = sc.nextDouble();
        System.out.println("What is the dollar price?");
        Double amount = sc.nextDouble();

        Double x = CurrencyConverter.dollarToReal(dollarPrice, amount);
        System.out.printf("%.2f%n", x);


    }
}