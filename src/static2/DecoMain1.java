package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "helloJava";
        DecoUnit1 utils = new DecoUnit1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
