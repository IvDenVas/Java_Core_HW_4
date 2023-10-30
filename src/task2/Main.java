package task2;

public class Main {

    public static void main(String[] args) {
        Object[][] info = {
                {Shop.buyers[0], Shop.products[0], 10},
                {Shop.buyers[1], Shop.products[2], 5},
                {Shop.buyers[0], Shop.products[1], -1},// сменить на +1
                {new Buyer("Ушаков", "Петр", 785612), Shop.products[2], 10},
                {Shop.buyers[1], new Product("Ведро", 100, 1), 2}
        };

        int capacity = 0;
        int i = 0;
        while (i < info.length && capacity != Shop.orders.length - 1) {
            try {
                Shop.orders[capacity] = Shop.buy((Buyer) info[i][0], (Product) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (BuyerException | ProductException e) {
                System.out.println(e.getMessage());
            } catch (CountException e) {
                Shop.orders[capacity++] = Shop.buy((Buyer) info[i][0], (Product) info[i][1], 1);
            } finally {
                System.out.println("Всего покупок: " + capacity);
            }
            ++i;
        }
    }
}
