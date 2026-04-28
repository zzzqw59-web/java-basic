package remind.oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data);
        System.out.println(data.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자: " + valueData.value);
    }
}
