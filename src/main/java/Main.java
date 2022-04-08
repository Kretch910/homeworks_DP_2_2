public class Main {

    public static void main(String[] args) {

        BinOps binOps = new BinOps();

        String a = "10";
        String b = "1011100111";

        System.out.println(binOps.sum(a, b));

        System.out.println(binOps.mult(a, b));
    }
}