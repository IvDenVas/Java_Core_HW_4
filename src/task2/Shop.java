package task2;

public class Shop {
    public static Buyer[] buyers = {
            new Buyer("Иванов", "Иван", 123465),
            new Buyer("Петров", "Петр", 789426),
            new Buyer("Сидоров", "Михаил", 456789)
    };
    public static Product[] products = {
            new Product("Мыло", 5, 50),
            new Product("Гель", 15, 50),
            new Product("Кондиционер", 25, 50)
    };

    public static Order[] orders = new Order[5];

    public static boolean inArray(Object[] array, Object o){
        for (Object obj : array) {
            if(obj.equals(o)) return true;
        }
        return false;
    }
    public static Order buy(Buyer buyer, Product product,int count) {
        try {
            if (!inArray(buyers,buyer)) throw new BuyerException("Такого покупателя нет!");
            else if (!inArray(products,product)) throw new ProductException("Такого товара нет!");
            else if (count < 0) throw new CountException("Указано отрицательное количество товара!");
            else return new Order(buyer,product,count);
        } catch (BuyerException | ProductException | CountException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
