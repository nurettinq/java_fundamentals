package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        List<String>eskiUrunler=new ArrayList<String>();
        urunler.add("kraker");
        urunler.add("cay");
        urunler.add("kahve");
        urunler.add("ikram");
        urunler.add("cekirdek");
        String yeniUrun="biskrem";
        String silinecekUrun="ikram";
        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);;
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi"+urunler);
        System.out.println("eski ürünler listesi"+eskiUrunler);

    }
}
