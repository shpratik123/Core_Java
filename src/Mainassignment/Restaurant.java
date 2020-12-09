package Mainassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items");
        int items = scanner.nextInt();
        int [] a = {20,50,100};
        int [] b = new int[a.length];

        for (int i=0; i<a.length;i++){
            b[i]=a[i];
        }

        for(int i=1; i<=items;i++){

            System.out.println("Enter price for item "+ i +":"+ b[i-1]);//item start from 1 and b ko value start from 0 tesaile -1 gareko
        }
        System.out.println();
        System.out.println("Now, Display below");
       int price = 0;
        for (int i=1; i <=items;i++){
            price = price + b[i-1];
        }
        System.out.println("Your bill");
        System.out.println("Price : "+price);
        double tax = 0.05 * price;


        System.out.println(tax);
        System.out.println("Please enter tips?");

        int tips = scanner.nextInt();
        double totalBill= price+tax+tips;
        System.out.println("Your total bill is = "+totalBill);

        }
    }


