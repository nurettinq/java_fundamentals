package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    // bir listedeki elemnetleri iterator kullanarak
    // sondan başa doğru yazdırınız
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,13,56,23,45,14,40);


    ListIterator li2= list.listIterator();
    while(li2.hasNext()) {
        li2.next();

    }
    while(li2.hasPrevious()) {
        System.out.print(li2.previous()+"");
    }
}}
