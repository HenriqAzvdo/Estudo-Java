package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity; //Não vou permitir alterar a quantidade do produto diretamente, só será alterado com o método add ou removed. Essa regra de negócio protege o uso indevido.

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

    //os métodos getters e setters são colocados depois dos construtores por convenção
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    //Para manter a integridade da regra de negócios, não será implementado o setter em quantity
    public Integer getQuantity() {
        return quantity;
    }

    //Método
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
