package Mainassignment;

public class Stringformatting {
    public static void main(String[] args) {
        String a = "Twinkle, twinkle, little star,";
        String b = "How i wonder what you are!";
        String c = "Up above the world so high,";
        String d = "Like a diamond in the sky.";
        String e = "Twinkle, twinkle little star,";
        String f = "How I wonder what you are";

        System.out.printf("%s%n", a);
        System.out.printf("\t%s %n", b);
        System.out.printf("\t\t%s%n", c);
        System.out.printf("\t\t%s%n", d);
        System.out.printf("%s%n", e);
        System.out.printf("\t%s%n", f);
    }
}