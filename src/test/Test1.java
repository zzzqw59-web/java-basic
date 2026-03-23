package test;

public class Test1 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상일 때, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하의 경우, 1000원 할인");
        }

        System.out.println("총 할인 금액" + discount);
    }
}
