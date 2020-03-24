package implementCharSeq;

public class Gnirts implements CharSequence {
    @Override
    public int length() {
        return this.valami.length();
    }

    @Override
    public char charAt(int index) {
        return this.valami.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.valami.subSequence(start,end);
    }

    String valami;

    public Gnirts(String valami) {
        this.valami = valami;
    }

    public static void main(String[] args) {
        Gnirts test = new Gnirts("pelda");

        System.out.println(test.length());
        System.out.println(test.charAt(2));
        System.out.println(test.subSequence(1,3));
        System.out.println(test.subSequence(1,4));
    }

}
