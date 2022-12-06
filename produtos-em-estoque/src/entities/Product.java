package entities;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;

    //construtor
    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //construtor sobrecarregado
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
        //poderia colocar quantity = 0 ou = 100 (valor padrão inicial igual o saldo bancario)
        //mas por padrão na instancia já é 0 ou null
    }

    public Double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, TOTAL: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
