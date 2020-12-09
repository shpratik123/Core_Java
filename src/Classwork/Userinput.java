package Classwork;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter age");
        int age = scanner.nextInt();

        System.out.println("Please enter name");
        String name = scanner.next();

        System.out.println("please enter email");
        String email = scanner.next();


        System.out.println("age is"+age+"name is"+name+",email is"+email );
        System.out.println("name is"+name);
        System.out.println("email is"+email);
        scanner.close();


    }
}
