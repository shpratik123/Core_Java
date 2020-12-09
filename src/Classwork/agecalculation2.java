package Classwork;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class agecalculation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter YYYY");
        int userYear=scanner.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - userYear;
        System.out.println("you are"+age+"yrs old.");

        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter YYYY");
        int userYear=scanner.nextInt();
        int now = LocalDate.now().getYear();
        System.out.println(now);
        int age = now- userYear;
        System.out.println("you are"+age+"yrs old.");*/
    }
}
