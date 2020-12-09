package Mainassignment;

import java.util.Scanner;

public class Secondstohhmmss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
       int p1 = (seconds/60);
       int p2= p1/60;
       int p3 = p1%60;
       int p4 = seconds%60;///seconds divided by 60ko remainder=%
        /* int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;*/
        System.out.print( p2 + ":" + p3 + ":" + p4);
        System.out.print("\n");

    }

}
