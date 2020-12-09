package Mainassignment;

import java.util.Scanner;

public class Equalinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first integer");
        int a = scanner.nextInt();
        System.out.println("enter second integer");
        int b = scanner.nextInt();
        System.out.println("enter third integer");
        int c = scanner.nextInt();
        System.out.println("enter fourth integer");
        int d = scanner.nextInt();

        if (a==b&& b==c && c==d && a==d){
            System.out.println("All four numbers are equal.");
        }
        else{
            System.out.println("All four are not equal otherwise");
    }

    }

    }
