package day22_MDAandList;

import java.util.Arrays;

public class C01_MultiDimenArray {
    public static void main(String[] args) {
        int [][] sayilar={{1,12,2,3,5,},{2,3,4,56,}};
        System.out.println(Arrays.toString(sayilar[0]));
        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);
        System.out.println(Arrays.deepToString(sayilar));

    }
}
