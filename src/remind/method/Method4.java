package remind.method;

public class Method4 {
    public static void main(String[] args) {
        checkAge(15);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자");
            return;
        }

        System.out.println(age + "살, 성인");
    }
}
