package Mainassignment;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        int width = scanner.nextInt();

        System.out.println("Enter height ");
        int height = scanner.nextInt();

        int area = width * height;
        int perimeter = 2*(width+height);

        System.out.println("the area of rectangle is :"+area);
        System.out.println("the perimeter of rectangle is :"+perimeter);

    }
}
