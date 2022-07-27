package day21_arrays;

import java.util.Arrays;

public class C05_ArrayEkle {
    public static void main(String[] args) {
        // verilen bir arraya eleman ekleyen bir metod yazınız
        String[] sinifList = {"ali can","nurullah güzel" };
        String eklenecek="nurettin güzel";
        sinifList=elemanEkle(sinifList,eklenecek);
        System.out.println(Arrays.toString(sinifList));
    }

    public static String[] elemanEkle(String[] sinifList, String eklenecek) {
        String[] yeniList=new String[sinifList.length+1];
        for (int i = 0; i <sinifList.length; i++) {
            yeniList[i]=sinifList[i];

        }
        yeniList[yeniList.length-1]=eklenecek;

        return yeniList;
    }
}
