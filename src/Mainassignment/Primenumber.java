package Mainassignment;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            //Here, note that we are looping from 2 to num/2. It is because a number is not divisible by more than its half.
            if (num % i == 0) {
                flag = true;
                break;
                // If num is divisible, flag is set to true and we break out of the loop. This determines num is not a prime number.
                //If num isn't divisible by any number, flag is false and num is a prime number.
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

       // If num is divisible, flag is set to true and we break out of the loop. This determines num is not a prime number.
        //If num isn't divisible by any number, flag is false and num is a prime number.
    }

}