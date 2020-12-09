package Mainassignment;

import java.util.Scanner;

public class Smalletter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your name");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("your name is    "+name);
    }
}
