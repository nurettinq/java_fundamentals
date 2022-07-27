package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(56);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Integer sil=56;
        list.remove(sil);
        System.out.println(list);
        list.remove(list.indexOf(7));
        System.out.println(list);
    }
}
