package Mainassignment;

import java.util.Scanner;

public class Vowelsconsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        //ASCII values  of alphabets: A – Z = 65 to 90, a – z = 97 to 122
        //if(str[i] >= 65 and str[i] <=90), then it is uppercase letter,
        //if(str[i] >= 97 and str[i] <=122), then it is lowercase letter,
        //if(str[i] >= 48 and str[i] <=57), then it is number,
        //else it is a special character
        //Print all the counters.
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
