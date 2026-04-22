package remind.cond;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 90;

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (80 >= score && score < 90) {
            System.out.println("학점은 B입니다.");
        } else if (70 >= score && score < 80) {
            System.out.println("C");
        } else if (60 >= score && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
