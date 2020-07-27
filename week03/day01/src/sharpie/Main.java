package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("brown",5);
      sharpie.use();
    System.out.println(sharpie.getInkAmount());
  }
}
