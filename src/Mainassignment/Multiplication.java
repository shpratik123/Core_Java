package Mainassignment;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number for multiplication");
        int number = scanner.nextInt();
        int mul;
        for(int i=1;i<=10;i++){
            mul = number*i;
            System.out.print(mul+" ");
        }

    }
}
