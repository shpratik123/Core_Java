package udemy;

public class BooleanAndOr {
    public static void main(String[] args) {
        int apple = 6;
        int orange = 9 ;
        double applePrice= 12.6;
        double orangePrice= 4.5;
        boolean moreApples = apple>orange;
        boolean applesAreDearer = applePrice>orangePrice;

        System.out.printf("Reducing apple cost: %s%n", (moreApples) && (applesAreDearer));
        System.out.printf("Reducing apple cost: %s%n", (moreApples) || (applesAreDearer));

    }
}

