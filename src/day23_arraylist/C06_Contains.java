package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_Contains {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");

        List<String> urunler2=new ArrayList<String>();
        urunler2.add("cay");
        urunler2.add("kahve");
        System.out.println(urunler.containsAll(urunler2));


    }
}
