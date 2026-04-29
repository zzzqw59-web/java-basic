package static2;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
    }

    public static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가: " + valueData.value);
    }
}
