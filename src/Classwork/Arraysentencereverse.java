package Classwork;

import java.util.Scanner;

public class Arraysentencereverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence");



        String output = scanner.nextLine();
        output = output.replaceAll(" ", "_");


        for (int i= output.length()-1;i>=0;i--){
            System.out.print(output.charAt(i));
        }
    }
}
