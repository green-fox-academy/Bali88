import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
    Scanner scanner = new Scanner(System.in);
    int userInput2;
    int guess = 10;
    do {
      System.out.println("Please guess a number");
      userInput2 = scanner.nextInt();
      if (guess > userInput2) {
        System.out.println("The stored number is higher");
      } else if (guess < userInput2) {
        System.out.println("The stored number is lower");
      } else {
        System.out.println("You found the number: " + guess);
      }
    }while (guess != userInput2);
  }
}


