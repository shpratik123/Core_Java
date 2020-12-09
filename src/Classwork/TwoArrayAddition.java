package Classwork;

public class TwoArrayAddition {
    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = {50, 60};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("sum of " + i + "index is" + c[i]);
        }
/*
 static int[] arr1 = {2, 3, 4, 5, 6};
            static int[] arr2 = {3, 5, 8, 90, 12};
            public static void main(String[] args) {
                System.out.println(Arrays.toString(addArray(arr1, arr2)));
            }
            private static int[] addArray(int[] arr1, int[] arr2) {
                int[] result=new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    result[i]=arr1[i] + arr2[i];
                }
                return result;
            }

 */
    }
}
