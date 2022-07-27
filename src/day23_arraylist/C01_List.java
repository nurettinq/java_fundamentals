package day23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(56);
        System.out.println("listin boyutu :"+ list.size());
        list.add(5);
        list.addAll(list);
        System.out.println(list);
        System.out.println("listenin yeni boyutu:"+list.size());
        list.set(3,17);
        System.out.println(list);
        System.out.println(list.set(0,12));
    }
}
