package kendi_kendime_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String[][]isim={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        yeniListe(isim);

    }

    private static void yeniListe(String[][] isim) {
        List<String> yeniListe = new ArrayList<String>();
        for (int i = 0; i <isim.length ; i++) {
            for (int j = 0; j <isim[i].length; j++) {
                yeniListe.add(isim[i][j]);

            }

        }
        System.out.println("ilk liste: "+yeniListe);
        Collections.sort(yeniListe);
        System.out.println("sıralamadan sonraki liste: "+yeniListe);
    }
}
