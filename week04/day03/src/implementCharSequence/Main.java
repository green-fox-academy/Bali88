package implementCharSequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.length());
    System.out.println(g.subSequence(4,2));
  }
}
