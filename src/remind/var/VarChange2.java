package remind.var;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = new Data();
        dataB.value = 20;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataA = " + dataB.value);

        dataA.value = 20;
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataA = " + dataB.value);

        dataB.value = 30;
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataA = " + dataB.value);
    }
}
