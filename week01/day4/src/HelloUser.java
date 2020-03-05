import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String userInput =  scanner.nextLine();
        System.out.println("hello " + userInput);
    }
}
