package Mainassignment;

public class Genderpercentage {
    public static void main(String[] args) {
        double total= 30;
        double male = 10;
        double female = total - male;
        double malePercentage = (male/total)*100;
        double femalePercentage = (female/total)*100;
        System.out.printf("We have %.2f male, %.2f female in class%n",malePercentage,femalePercentage);

    }
}
