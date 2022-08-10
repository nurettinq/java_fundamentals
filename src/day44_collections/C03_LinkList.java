package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkList {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList();
        List<String> ll2=new LinkedList();
        Queue<String> ll3=new LinkedList();
        Deque<String> ll4=new LinkedList();
        ll2.add("nurettin");
        ll2.add("nesibe");
        ll2.add("nurullah");
        ll2.add("nuri");
        System.out.println(ll2);
        ll2.set(3,"nurten");
        System.out.println(ll2);

    }
}
