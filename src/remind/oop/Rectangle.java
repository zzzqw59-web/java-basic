package remind.oop;

public class Rectangle {
    int width;
    int height;

    static int calculrateArea(int width, int height) {
        return width * height;
    }

    static int calculratePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return  width == height;
    }
}
