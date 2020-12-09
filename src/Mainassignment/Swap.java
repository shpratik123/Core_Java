package Mainassignment;

public class Swap {
    public static void swap(int a, int b){
        int t = a;
        a=b;
        b=t;
        System.out.println("a = " + a +","+"b = "+b);
        //System.out.printf("a = %d b = %d%n",a,b);

    }
    public static void main(String[] args) {
 swap(2,3);


    }
        

}
