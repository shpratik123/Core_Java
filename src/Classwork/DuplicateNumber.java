package Classwork;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];//new integer 10 ota rakhna ko lagi
        int c = 0;
        for(int i =0; i<10;i++){//i ko value 0 coz 0 dekhi start huncha array ma, length chahi 10 coz 10 ota value
            System.out.println("please input 10 numbers");
            a[i]= scanner.nextInt();
        }
        for(int i =0; i<10;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("enter the number you want to count the duplicate value");
        int b = scanner.nextInt();
        for(int i =0; i<10;i++){
            if(b==a[i]){

                c++;// yesko lagi mathi value define gare cha... c=o
            }
        }

        System.out.println("duplicate data for data entered:" +b +" is"+c);
    }
}
/*
  public static void main(String[] args) {
                int[] numbers = new int[]{20,20,24,35,35,37,35,50,50,50};
                findDuplicate(numbers);
            }
            static void findDuplicate(int[] a) {
                int count = 1;
                for (int j = 0; j < a.length; j++) {
                    for (int k = j + 1; k < a.length; k++) {
                        if (a[j] == a[k]) {
                            count++;  //
                        }
                    }
                    if (count == 2)
                        System.out.println(a[j]);
                    count = 1;
                }
            }

 */
