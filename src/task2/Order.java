package task2;

public class Order {
    private Buyer buyer;
    private Product product;
    private int count;

    public Order(Buyer buyer, Product product, int count) {
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }

//    public static Order buy(Buyer buyer, Product product,int count) {
//        try {
//            if (buyer == null) throw new BuyerException("Такого покупателя нет!");
//            else if (product == null) throw new ProductException("Такого товара нет!");
//            else if (count < 0) throw new CountException("Указано отрицательное количество товара!");
//            else return new Order(buyer,product,count);
//        } catch (BuyerException | ProductException | CountException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//
//    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", count=" + count +
                '}';
    }
}
