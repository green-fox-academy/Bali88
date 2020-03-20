package arrays;

import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

        // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

        int[] numbers = {3,4,5,6,7};
        int[] goal = numbers.clone();
        int j = 0;

        for (int i = 0; i <numbers.length ; i++) {
//            System.out.println(i);
//            System.out.println(numbers[i]);
            goal[numbers.length-1-i]=numbers[i];
        }
        System.out.println("Reverse list:");
        for (int g:goal) {
            System.out.print(g + " ");
        }

//        for (int i = numbers.length-1; i >= 0; i--) {
////            System.out.print(numbers[i]);
//            goal[j]=numbers[i];
//            j++;
//        }
//        System.out.println("Reverse list:");
//        for (int g:goal) {
//            System.out.print(g + " ");
//        }
    }

}
