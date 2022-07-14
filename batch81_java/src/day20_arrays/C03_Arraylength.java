package day20_arrays;

import java.sql.Array;
import java.util.Arrays;

public class C03_Arraylength {
    public static void main(String[] args) {
         int sayilar[]={1,2,3,4,5};
         String harfler[]=new String[4];
        System.out.println("sayıların length i:"+sayilar.length);
        System.out.println("harfker in lengthi:"+harfler.length);
        System.out.println(Arrays.toString(harfler));
        System.out.println("harfler arrayinin son index : "+harfler[harfler.length-1]);
    }
}
