package task2;

public class Product {
    private String name;
    private int price;
    private int count;

    public Product(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", цена: " + price +
                ", количество: " + count;
    }
}
