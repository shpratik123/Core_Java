package Assignment;

import java.util.Scanner;

public class Exceptionassign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

while(true){
    System.out.println("please enter your age");
    try{
        int age = s.nextInt();
        break;
        }
        catch (Exception e) {

                System.out.println("please input only number");
            s.nextLine();
//continue;
            }
        }
        System.out.println("thank you");
    }
}

/*    public static void main(String[] args) {
        int age;
        //boolean flag=true;
        while(true)
        {
            System.out.println("Please input your age");
            try {
                Scanner scan=new Scanner(System.in);
                age= scan.nextInt();
                break; //exit , while loop and print thank you
            }
            catch (Exception e){
                System.out.println("Input only no !");
                //continue;
                //flag=true;
            }
        }
        System.out.println("Thank you , you will be able to drive after " + (17-age) + "years");
    }*/