package Classwork;

import java.util.Scanner;

public class Luckygame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("enter a no in range [1-10]");
            try {
                int number = s.nextInt();
                break;
            } catch (Exception e) {

                System.out.println("please input between 1-10");
                s.nextLine();
            }
        }
    }
}
