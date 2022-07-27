package kendi_kendime_3;

import java.lang.reflect.Array;

public class C15_Array {
    public static void main(String[] args) {
        /*Example:
        Input :
        nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
        Output:
        Pair is (7, 8), Maximum Product: 56
    */
        int[]numbers={2,5,7,3,-7,-9};
        int maxProduct=Integer.MIN_VALUE;
        int maxi=0;
        int mini=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if(maxProduct<numbers[i]*numbers[j]) {
                    maxProduct = numbers[i]*numbers[j];
                    maxi=i;
                    mini=j;


                }


            }


                    }
        System.out.println("maxProduct = " + maxProduct);
        System.out.println("min ve max ikilisi ("+numbers[mini]+","+numbers[maxi]+")");
    }
}
