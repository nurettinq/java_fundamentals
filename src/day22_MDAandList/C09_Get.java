package day22_MDAandList;

import java.util.ArrayList;
import java.util.List;

public class C09_Get {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(45);
        list.add(32);
        list.add(61);
        list.add(85);
        List<String> list2=new ArrayList<>();
        list2.add("enes");
        list2.add("nurettin");
        list2.add("sevda");
        list2.add("kevser");
        System.out.println(list2.get(1));
        System.out.println(list.get(2));
    }

}
