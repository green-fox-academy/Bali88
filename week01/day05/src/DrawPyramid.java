public class DrawPyramid {
  public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
