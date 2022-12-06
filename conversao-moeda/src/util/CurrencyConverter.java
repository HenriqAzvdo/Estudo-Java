package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double dollarToReal(Double priceDolar, Double amount) {
        return priceDolar * amount * (1.0+ IOF);
    }

}
