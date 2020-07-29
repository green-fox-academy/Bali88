package recursion;

public class SumDigits {

  public static void main(String[] args) {
    System.out.println(SumOfDigit(125));
  }

  public static int SumOfDigit(int num){
    if (num == 0)
      return 0;
    return (num % 10 + SumOfDigit(num/10));
  }
}
