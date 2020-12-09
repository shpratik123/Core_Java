package Mainassignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Firstcapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a sentence");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        System.out.println(input);
    }
}
