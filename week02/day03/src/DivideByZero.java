import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
  divisor();
  }

  public static void divisor() {
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();
    try {
      int result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
      e.printStackTrace();
    }
  }
}
