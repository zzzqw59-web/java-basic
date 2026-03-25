package oop1;

public class Rectangle {
    int width;
    int height;

    int calculrateArea() {
        return width * height;
    }

    int calculratePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
