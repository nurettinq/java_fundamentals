package day23_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_Sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");
        Collections.sort(urunler);
        System.out.println(urunler);
    }
}
