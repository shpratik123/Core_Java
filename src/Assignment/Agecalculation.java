package Assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Agecalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear()- age;

        System.out.println("You were born in year: "+year);

        }
    }

