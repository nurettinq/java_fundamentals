package kendi_kendime_2;

import java.util.Arrays;

public class C19_Arrays {
    public static void main(String[] args) {
        //// Verilen bir metin içinde kullanılan harfleri, bir diziye aktarın ve yazdırın.
        //// metinde kullanılan bir karakter diziye daha önce aktarılmış ise ikinci defa aktarılmayacaktır.
        //// Boşluklar diziye aktarılmayacaktır.
        //// Oluşturulacak Char dizinin eleman sayısı içine aktarılacak karakter adeti olacaktır.
        //
        //
        String metin = "Ey Türk gençliği! Birinci vazifen; Türk istiklalini, Türk cumhuriyetini, ilelebet muhafaza ve müdafaa etmektir";
       String unique="";

        for (int i = 0; i <metin.length(); i++) {
            String k=metin.substring(i,i+1);
            if(!unique.contains(k)){
                unique+=k;
            }

        }
        System.out.println(unique);
        unique=unique.replaceAll(" ","");
        char[] myArrays=new char[unique.length()];
        for (int i = 0; i <unique.length(); i++){
            myArrays[i]=unique.charAt(i);

        }
        System.out.println("latest version: "+Arrays.toString(myArrays));


    }
}
