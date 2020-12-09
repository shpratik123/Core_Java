package Classwork;

public class Arraycapital {
    public static void main(String[] args) {
        //print first and last name to capital
        String[] names = {"ram", "hari", "shyam", "gita", "john"};
        for (int i = 0; i <= 4; i++) {   //for (int = 0; i<names.length;i++)
            if (i == 0 || i == 4) {
                System.out.println(names[i].toUpperCase());
            } else {
                System.out.println(names[i]);
            }

        }

    }
}
