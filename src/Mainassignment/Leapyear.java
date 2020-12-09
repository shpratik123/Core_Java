package Mainassignment;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates leap year.");
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();


        if ((year % 4 == 0) && year % 100 != 0) { // evenly divide by 4 and not evenly divide by 100
            System.out.println(year + " is a leap year.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {//divide by 100 bhaye ki400 le ni divide hunu parcha
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");

        }
    }
}
