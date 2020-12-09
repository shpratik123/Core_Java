package Classwork;

public class Arrayintro {
    public static void main(String[] args) {
        //option 1 define an array
        String[] names = {"john", "jack", "james"};
        System.out.println(names[0] + names[2]);
        System.out.println(names.length);//kati ota variable cha tyo dekhaucha

        //option 2 yo nagarda ni huncha
        String[] names2 = new String[]{"john", "jack", "james", "honey"};
        System.out.println(names2.length);

        //loops with index yedi dherai wata names garnu paryo suppose 100 names
        String[] names3 = {"john", "jack", "james"};
        for (int i = 0; i < 3; i++) {   //for (int = 0; i<names3.length;i++)

            System.out.println(names3[i]);

        }


    }
}