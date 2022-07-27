package kendi_kendime_3;

import java.util.Arrays;

public class C17_Array {
    public static void main(String[] args) {
        /*Methoda iki sayı girelim ve  bize bir array dönsün.
                Array elemanları 1.sayının 2. sayı kadar kendisi ile
        toplamından oluşsun.
        Test Data:
        arrayOfMultiples(7, 5)
        sonuç: [7,14,21,28,35]*/
        int a=17;
        int b=9;
        int[]sayiKatlari=new int[b];
        for (int i = 1; i <=b ; i++) {
            sayiKatlari[i-1] =a*i;

        }
        System.out.println(Arrays.toString(sayiKatlari));


    }
}
