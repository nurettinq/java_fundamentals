package practice22temmuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_Array_Onemli {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int [] array={2,3,4,5,6,674,3,45,6,68,377,4,377};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

    List<Integer> numList=new ArrayList<Integer>();
        for (int each:array) {
            numList.add(each);


        }List<Integer> maxList=new ArrayList<Integer>();
        int sayac=1;
        while(sayac<=num){
            int max=numList.get(0);
            for (int i = 0; i <numList.size() ; i++) {
                if(numList.get(i)>max&&!(maxList.contains(numList.get(i)))){
                    max=numList.get(i);

                }

            }maxList.add(max);
            numList.remove(numList.indexOf(max));
            sayac++;
        }
        System.out.println("arrayin max "+num+" elmani "+maxList);
}}
