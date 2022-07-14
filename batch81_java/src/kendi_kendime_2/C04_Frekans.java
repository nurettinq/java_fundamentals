package kendi_kendime_2;

import java.util.Arrays;

public class C04_Frekans {
    public static void main(String[] args) {
        String sifre="aaabbssfddd";
        frekanss (sifre);

    }

    private static void frekanss(String sifre) {
        String arr[]=sifre.split("");


        System.out.println(Arrays.toString(arr));


    }

}
