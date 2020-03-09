import javax.swing.*;

public class CompareLength {
    public static void main(String[] args) {

        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArraysOfNumbers = {4, 5};
        if (secondArraysOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("secondArrayOfNumbers is longer");


        }else {
            System.out.println("firstArrayOfNumbers is longer");
        }
    }
}

