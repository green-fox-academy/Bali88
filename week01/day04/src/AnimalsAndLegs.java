import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chicken?");
        int userInput2 = scanner.nextInt();
        int c = userInput2 * 2;
        System.out.println("How many pig?");
        userInput2 = scanner.nextInt();
        int p = userInput2 * 4;
        System.out.println("The animals has: " + (c + p) + " legs");










    }
}
