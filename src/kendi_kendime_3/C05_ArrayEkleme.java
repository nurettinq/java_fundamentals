package kendi_kendime_3;

import java.util.Arrays;

public class C05_ArrayEkleme {
    public static void main(String[] args) {
        String [] doktorlar={"ali","veli","fatih","nuri","salih"};
        String [] eklkenecek={"sumeyye","fatma"};
        doktorlar=doktorEkle(doktorlar,eklkenecek);
        System.out.println(Arrays.toString(doktorlar));

    }

    private static String[] doktorEkle(String[] doktorlar, String[] eklkenecek) {
    String [] doktorlarYeni=new String[doktorlar.length+eklkenecek.length];
        for (int i = 0; i <doktorlar.length; i++) {
            doktorlarYeni[i] = doktorlar[i];


        }
        for (int i = doktorlar.length; i < doktorlar.length+eklkenecek.length; i++) {
            doktorlarYeni[i] = eklkenecek[i-doktorlar.length];

        }return doktorlarYeni;
    }
}
