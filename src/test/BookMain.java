package test;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello java", "SEO");
        book2.displayInfo();

        Book book3 = new Book("java", "KIM", 700);
        book3.displayInfo();
    }
}
