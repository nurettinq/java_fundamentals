package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("enes");
        list.add("fatma");
        list.add("kemal");
        System.out.println(list);
        list.set(1,"nurettin");
        System.out.println(list);
        list.remove("enes");
        System.out.println(list);
    }
}
