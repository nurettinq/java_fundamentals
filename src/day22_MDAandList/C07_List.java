package day22_MDAandList;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(29);
        sayilar.add(3);
        System.out.println(sayilar);
        sayilar.add(0,45);
        sayilar.add(3,56);
        System.out.println(sayilar);

    }
}
