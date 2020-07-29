package recursion;

public class NumberAdder {
  //  Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static void main(String[] args) {
    System.out.println(numberAdder(5));
  }

  public static int numberAdder(int num) {
    if (num != 0) {
      return num + numberAdder(num - 1);
    } else {
      return num;
    }
  }
}
