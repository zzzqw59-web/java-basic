package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 1500, 3);
        orders[1] = createOrder("김치", 2000, 5);
        orders[2] = createOrder("콜라", 1800, 6);

        printOrder(orders);
        int totalAmount = getAmount(orders);
        System.out.println("총 결제금액: " + totalAmount + "원");


    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 갯수: " + order.quantity);
        }
    }

    static int getAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
