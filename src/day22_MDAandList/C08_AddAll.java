package day22_MDAandList;

import java.util.ArrayList;
import java.util.List;

public class C08_AddAll {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(45);
        list.add(32);
        list.add(61);
        list.add(85);
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(8);
        list2.add(61);
        list2.add(48);
        list2.add(32);
        list.addAll(list2);
        System.out.println(list);
        list.addAll(1,list2);
        System.out.println(list);

    }
}
