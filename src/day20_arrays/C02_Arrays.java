package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[5];
        //System.out.println(sayilar);
        sayilar[0]=5;
        sayilar[1]=2;
        sayilar[2]=53;
        sayilar[3]=4;
        sayilar[4]=85;
        System.out.println(Arrays.toString(sayilar));
        String sinifList[]= {"ali","nuri","memo"};
        System.out.println(Arrays.toString(sinifList));
        sinifList[2]="nurettin";
        System.out.println(Arrays.toString(sinifList));
        System.out.println(sinifList[1]);


    }

}
