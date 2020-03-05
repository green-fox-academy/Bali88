public class Swap {
    public static void main(String[] args) {
        Integer a = 123;
        Integer b = 526;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }


}
