package Classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your age");
       try {
           int age = s.nextInt();
       }
// if you dont know exception
       //catch(Exception e){
       //  e.printStackTrace();
       //System.out.println("please input only number");

      //if youknow which exception to use and u can use multiple exception at same time
       catch (NumberFormatException e){
           System.out.println("number format mismatch");

       }
       catch(InputMismatchException e){
           e.printStackTrace();
           System.out.println("please input only number");
       }


    }
}
