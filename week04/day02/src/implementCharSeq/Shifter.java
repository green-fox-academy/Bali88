package implementCharSeq;

public class Shifter implements CharSequence {
    @Override
    public int length() {
        return this.pelda2.length();
    }

    @Override
    public char charAt(int index) {
        return this.pelda2.charAt(index + this.howManyToShift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.pelda2.subSequence(start,end);
    }

    String pelda2;
    int howManyToShift;
    public Shifter(String pelda2, int howManyToShift ) {
        this.pelda2 = pelda2;
        this.howManyToShift = howManyToShift;
    }

    public static void main(String[] args) {

        Shifter test2 = new Shifter("megvalami", 2);
        System.out.println(test2.length());
        System.out.println(test2.charAt(0));
        System.out.println(test2.subSequence(2,5));

    }

}
