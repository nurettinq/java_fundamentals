package day23_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapma {
    public static void main(String[] args) {

        Integer[]arr={1,14,12,3,5,4,565,5,433,4};
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);

        }
        System.out.println(list);
        List<Integer> list2 = Arrays.asList(arr);  //asList sıkıntılı kullanma.
                                                    // listeyi kullanmayacaksak asList kullanılabilir
        list.add(5);
        System.out.println(list);
       // list2.add(32);
        //System.out.println(list2);


    }
}
