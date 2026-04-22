package lecture;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum = sum + num;
            num++;
        } while (num <= 10);

        System.out.println(sum);
    }
}
