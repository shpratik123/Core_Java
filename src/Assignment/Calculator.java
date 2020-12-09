package Assignment;


public class Calculator {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
public static int sub(int a, int b){
    int i = a - b;
    System.out.println(i);
    return i;
}
public static void mul(int a, int b){
    System.out.println(a*b);
}
public static double div(int a, int b){
        double c = a/b;
    System.out.println(c);
    return c;
}
    public static void main(String[] args) {
        add(2,3);
        sub(2,3);
        mul(2,3);
        div(3,2);
    }
}
