package day22_MDAandList;

import java.util.Arrays;

public class C04_MultiDimensional {
    public static void main(String[] args) {
        int [][]sayilar={{1,2,3,67},{3,54,6,7},{3,5,78,9,5}};
        int []sayilarTopla=new int[sayilar.length];
        int toplam=0;
        for (int i = 0; i <sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length; j++) {
              toplam += sayilar[i][j];

            }
            sayilarTopla[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(sayilarTopla));
    }
}
