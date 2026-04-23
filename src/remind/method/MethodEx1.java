package remind.method;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int x = 15;
        int y = 25;
        int z = 35;

        int sum1 = sum(a, b, c);
        double average1 = average(sum1, 3);
        int sum2 = sum(x, y, z);
        double average2 = average(sum2, 3);

        System.out.println(average1);
        System.out.println(average2);
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int sum, int number) {
        return sum / number;
    }
}
