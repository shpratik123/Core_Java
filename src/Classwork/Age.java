package Classwork;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("invalid age");
        }
        else if ((age >= 1) && (age <= 12)) {
            System.out.println("kid");

        }
        else if ((age >= 13) && (age <= 24)) {
            System.out.println("young");
        }
        else if ((age >= 25) && (age <= 40)) {
            System.out.println("younger");
        }
        else if (age>40) {
            System.out.println("getting older");
        }
    }
    }


