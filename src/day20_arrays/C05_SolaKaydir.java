package day20_arrays;

import java.util.Arrays;

public class C05_SolaKaydir {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6};

        int temp0=sayilar[0];
        for (int i = 0; i <sayilar.length-1; i++) {
            sayilar[i]=sayilar[i+1];


        }
        sayilar[sayilar.length-1]=temp0;
        System.out.println(Arrays.toString(sayilar));
        int temp1=sayilar[sayilar.length-1];
        for (int i = sayilar.length-1; i>0; i--) {
            sayilar[i]=sayilar[i-1];

        }
        sayilar[0]=temp1;
        System.out.println(Arrays.toString(sayilar));
    }
}
