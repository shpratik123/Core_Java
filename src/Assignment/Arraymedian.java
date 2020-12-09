package Assignment;

import javax.print.attribute.standard.MediaName;
import java.util.Arrays;

public class Arraymedian {
    public static void main(String[] args) {
      int[] number={29,45,23,78,23,23,8};
        int[] number1={29,45,23,78,23,23,89,50};
        int arraySize =number1.length;

        double result;
        if (arraySize%2==0){

            int median = number1[(arraySize-1)/2]+number1[((arraySize-1)/2)+1];
            result = median/2;
            System.out.println(result);

        } else {
            // get the middle element
           result= (double) number[arraySize/2];
            System.out.println(result);

        }

    }
}
