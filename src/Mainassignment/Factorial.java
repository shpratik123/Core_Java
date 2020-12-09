package Mainassignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int result=1;
        int number=scanner.nextInt();//It is the number to calculate factorial
        for(int i=1;i<=number;i++){
            result=result*i;


        }
        System.out.println("Factorial of "+number+" is: "+ result);
    }
}
