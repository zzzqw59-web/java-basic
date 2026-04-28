package remind.method;

public class MethodTest {
    public static void main(String[] args) {
        printNumber(5);
        checkAge(17);
        int result = add(3, 5);
        System.out.println(result);
        boolean check = isEven(6);
        System.out.println(check);
        String grade = getGrade(85);
        System.out.println(grade);
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }

    public static void checkAge(int age) {
        System.out.println(age);
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else {
            return "C";
        }
    }
}
