package practice16temmuz;

import java.util.Scanner;

public class C05_Arays {
    public static void main(String[] args) {
           /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("8 elemanlı bir array giriniz");
        int[]num=new int[8];
        int count=0;
        for (int i = 0; i <8 ; i++) {
            System.out.println(i+".indexi gir");
            num[i]=scan.nextInt();

        }
        for (int i = 0; i <8 ; i++) {
            if(num[i]%3==0){
            }                System.out.print(num[i]+" ");

            count++;




        } System.out.println("\n"+count+" tanesii 3 e tam bölünür ");
    }
}
