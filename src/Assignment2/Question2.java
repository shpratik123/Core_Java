package Assignment2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 6, 8, 9};
        System.out.println("Select the number from the list that you want to search : 1,3,5,6,8,9 ");
        int number = scanner.nextInt();
        for (int a : arr) {
            if (number == a) {
                int length =arr.length-1;
                System.out.println(a+"is in"+length  +"index");
            }

        }
    }
}

