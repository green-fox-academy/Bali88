package arrays;

public class SumAll {
    public static void main(String[] args) {
//        Print the sum of the elements in `numbers`
        int [] numbers = {3,4,5,6,7};
        int sum = 0;

        for (int i = 0; i <numbers.length ; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

//        for (int n:numbers) {
//            System.out.print(n+" ");
        }


    }

