package function;

public class Sum {
  // Create the usual class wrapper and main method on your own.

  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
  public static void main(String[] args) {
    System.out.println(sum(5));
  }

  public static int sum(int input) {
    int a = 0;
    for (int i = 0; i <= input; i++) {
      a = i + a;
    }
    return a;
  }

}