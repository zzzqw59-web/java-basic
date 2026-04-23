package remind.loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }
        }
    }
}
