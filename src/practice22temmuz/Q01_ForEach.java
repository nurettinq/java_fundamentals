package practice22temmuz;

import java.util.ArrayList;
import java.util.List;

public class Q01_ForEach {
    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
       List<Integer> cift = new ArrayList<Integer>();
       List<Integer> tek = new ArrayList<Integer>();

        for(int each:arr){
            if(each%2==0){
          cift.add(each);
            }

        }                System.out.println("çift sayilar"+cift);

        for(int each:arr){
            if(each%2!=0) {
              tek.add(each);
            }

    }
        System.out.println("tek sayılar :"+tek);
}}
