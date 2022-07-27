package day24_foreachlopp;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int []arr={2,5,58,5,89,5,8};
        List<Integer> list=new ArrayList<Integer>();
        for (int each:arr){
            if(each%2==1){
                list.add(arr[each]);
            }
        }
        System.out.println(list);
    }
}
