package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexIOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");
        System.out.println(urunler.indexOf("kraker"));
        System.out.println(urunler.lastIndexOf("kraker"));

        urunler.add("cay");
        System.out.println(urunler.indexOf("cay"));
        System.out.println(urunler.lastIndexOf("cay"));
        System.out.println(urunler.indexOf("su"));
        System.out.println(urunler.lastIndexOf("su"));
    }
}
