package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C01_listIterator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,13,56,23,45,14,40);
        System.out.println(list);
        int bas=20;
        int bitis=40;
        ListIterator li1= list.listIterator();
  while(li1.hasNext()) {
      Integer temp=(Integer)li1.next();
      if(temp<bas||temp>bitis){
          li1.remove();
      }
  }
        System.out.println(list);
    }
}
