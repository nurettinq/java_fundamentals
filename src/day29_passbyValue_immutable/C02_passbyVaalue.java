package day29_passbyValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_passbyVaalue {
    public static void main(String[] args) {
        int [] arr={3,4,6,8};
        System.out.println(Arrays.toString(arrayiDegistir(arr)));

        System.out.println("method call  dan sonra main methodda array array :"+ Arrays.toString(arr));
    }

    private static int []arrayiDegistir(int[] arr) {
        arr=new int [3];
        Random rand = new Random();
        arr[0]=rand.nextInt(100);
        arr[1]=rand.nextInt(100);
        arr[2]=rand.nextInt(100);
        System.out.println("methodda array :"+ Arrays.toString(arr));
   return arr;
    }
}
