package Classwork;

import java.text.NumberFormat;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operator from the given list: (+,-,*,/)");
        String operator = scanner.nextLine();
        int firstNumber = 20;
        int secondNumber = 30;
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

double a = 30;
double b=20;
        double division = a/b;



        switch (operator){
            case "+":

                System.out.println("the result is" + sum);
                break;
            case "-":

                System.out.println("the result is" + difference);
                break;
            case "*":

                System.out.println("the result is" + multiplication);
                break;
            case "/":


                System.out.println("the result is"+ division);

                break;

        }



    }
}
