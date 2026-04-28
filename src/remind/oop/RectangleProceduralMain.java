package remind.oop;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculrateArea(5, 8);
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculratePerimeter(5, 8);
        System.out.println("둘레 길이: " + perimeter);

        boolean sqare = rectangle.isSquare(5, 8);
        System.out.println("정사각형 여부: " + sqare);
    }
}
