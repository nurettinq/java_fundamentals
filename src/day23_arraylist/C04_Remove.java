package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");
        urunler.remove("cay");
        System.out.println(urunler);
        urunler.remove(2);
        System.out.println(urunler);
    }
}
