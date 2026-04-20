package test;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바", "김개발");
        Book book2 = new Book("스프링", "이백엔드", 20000);

        book1.printInfo();
        book2.printInfo();
    }
}
