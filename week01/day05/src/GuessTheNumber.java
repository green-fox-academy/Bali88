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
    System.out.println("Please guess a number");
    int userInput2 = scanner.nextInt();
    int guess = 10;
    boolean correctGuess = true;


    if (guess > userInput2) {
      System.out.println("The stored number is higher");
    } else if (guess < userInput2) {
      System.out.println("The stored number is lower");
    } else {
      System.out.println("You found the number: " + guess);
    }

  }
}


