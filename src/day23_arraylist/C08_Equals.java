package day23_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_Equals {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");
        List<String> urunler2=new ArrayList<String>();
        urunler2.add("cay");
        urunler2.add("kraker");
        urunler2.add("kahve");
        urunler2.add("ikram");
        System.out.println(urunler);
        System.out.println(urunler2);
        System.out.println(urunler.equals(urunler2));
        Collections.sort(urunler);
        Collections.sort(urunler2);
        System.out.println(urunler.equals(urunler2));


    }
}
