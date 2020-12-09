package Mainassignment;

public class Divisble3and5 {
    public static void main(String[] args) {
        System.out.println("Divided by3:");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
                }
            }
        System.out.println();
        System.out.println("Divided by5:");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("Divided by 3 and 5:");
        for (int i = 0; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + ",");
            }
        }

        }
    }
