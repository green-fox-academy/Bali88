package recursion;

public class Power {
  public static void main(String[] args) {
    System.out.println(power(3, 2));
  }


  public static int power(int base, int powerRaise) {
    if (powerRaise != 0) {
      return (base * power(base, powerRaise - 1));
    } else {
      return 1;
    }
  }
}
