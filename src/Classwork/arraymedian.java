package Classwork;

import java.util.Arrays;

public class arraymedian {
    public static void main(String[] args) {
        int[][] nos={//array ko bhitra ni array gareko
                {2,4,5,6,7,8,9}, {2,4,5,6,7,8}, {1,5,7,8,9,3,2,12,12,24}
        };
        for(int[] n:nos) {
            int result[] = findMid(n);
            System.out.println(Arrays.toString(result));// arko value print garne tarika a[1],a[2]
        }
    }
    public static int[] findMid(int[] inputs){
        int[] mid;
        if(inputs.length%2!=0) {
            mid=new int[1];
            mid[0] = inputs[inputs.length / 2];
        }
        else
        {
            mid=new int[2];
            mid[0]=inputs[inputs.length / 2-1];
            mid[1]=inputs[(inputs.length / 2)];
        }
        return mid;
    }
}


