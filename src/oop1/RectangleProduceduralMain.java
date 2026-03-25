package oop1;

public class RectangleProduceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculrateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculratePerimeter();
        System.out.println("둘레길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);


    }
}
