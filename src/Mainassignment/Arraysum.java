package Mainassignment;

public class Arraysum {
    public static void main(String[] args) {

        /*int [] num = {2,5,8};
        int length= num.length;
        System.out.println(length);
        System.out.println(num[0]+num[1]+num[2]);*/
      int num = 258;

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
