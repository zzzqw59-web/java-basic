package test;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 50);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("title: " + title + ", author: " + author + ", page: " + page);
    }

}
