package remind.array;

public class ArrayCheck3 {
    public static void main(String[] args) {
        int[] arr = {70, 80, 90};
        int sum = 0;
        double average;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println(average);

        for (int i : arr) {
            sum = sum + i;
        }
        average = sum / arr.length;
        System.out.println(average);
    }
}
