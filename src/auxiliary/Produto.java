package auxiliary;

public class Produto {
    private String name;
    private Double price;
    private int quantity;
    private Double fullPrice;

    public Produto(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        setFullPrice();
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice() {
        this.fullPrice = quantity * price;
    }
}
