package test;

public class Book {
    String title;
    String author;
    int price;

    Book(String title, String author) {
        this(title, author, 10000);
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + price);
    }
}
