import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number!");
    int inputNumberOne = scanner.nextInt();
    System.out.println("Please enter a number!");
    int inputNumberTwo = scanner.nextInt();
    if (inputNumberOne > inputNumberTwo){
      System.out.println(inputNumberOne);
    } else {
      System.out.println(inputNumberTwo);
    }
  }
}
