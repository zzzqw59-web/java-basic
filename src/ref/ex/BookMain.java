package ref.ex;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = createBook("자바입문", 20000);
        books[1] = createBook("스프링기초", 30000);

        printBook(books);
        System.out.println("총 가격: " + getAmount(books));

    }

    static Book createBook(String title, int price) {
        Book book = new Book();
        book.title = title;
        book.price = price;
        return book;

    }

    static void printBook (Book[] books) {
        for (Book book : books) {
            System.out.println("상품명: " + book.title + ", 가격: " + book.price);
        }
    }

    static int getAmount (Book[] books) {
        int totalAmount = 0;
        for (Book book : books) {
            totalAmount += book.price;
        }
        return totalAmount;
//         테스트용 합니다.
    }
}
