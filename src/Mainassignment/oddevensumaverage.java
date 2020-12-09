package Mainassignment;

public class oddevensumaverage {
    public static void main(String[] args) {
        int[] number = {2,4,5,6,22,33,34,45,49,60};
        int odd = 0;
        int even = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for(int i=0;i<number.length;i++) {
            if (number[i] % 2 == 0) {
                even = even + 1;
                sumEven = sumEven + number[i];

            } else {
                odd = odd + 1;
                sumOdd = sumOdd+number[i];
            }
        }
        double averageEven = sumEven/even;
        double averageOdd = sumOdd/odd;

        System.out.println("Total numbers of even numbers are: "+ even);
        System.out.println("Sum of even number: "+sumEven);
        System.out.println("Average of even number: "+averageEven);
        System.out.println();
        System.out.println("Total numbers of odd numbers are: "+odd);
        System.out.println("Sum of odd number: "+sumOdd);
        System.out.println("Average of odd number: "+averageOdd);
    }
}
