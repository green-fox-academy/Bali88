import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is ur name?");
        // The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1);
    }
}
