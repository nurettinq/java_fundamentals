package kendi_kendime_3;

import java.util.Arrays;

public class C16_ArraySum {
    public static void main(String[] args) {
        /*Write a Java program to find all triplets equal to a given sum in a unsorted array of integers.   Go to the editor

        Example:
        Input :
        nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
        Output:
        Triplets of sum 7
        (0 1 6)
        (0 3 4)*/
        int []nums={1,7,3,4,6,8,5,4,0,2};
        int sum=7;
        int a=0,b=0,c=0;
        for (int i = 0; i < nums.length-2 ; i++) {
            for (int j = i+1; j <nums.length-1 ; j++) {
                for (int k = j+1; k <nums.length; k++) {
                    if(sum==nums[i]+nums[j]+nums[k]){

                      a=nums[i];
                      b=nums[j];
                      c=nums[k];
                      System.out.println(a+" "+b+" "+c);

                    }

                }

            }


        }

    }
}
