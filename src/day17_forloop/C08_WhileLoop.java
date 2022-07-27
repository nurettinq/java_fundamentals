package day17_forloop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan sayılar alın ve toplamı 500 geçince "13 sayı girdiniz vve toplamı 567" desin
        int toplam=0;
                int sayi=0;
                int sayac=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen toplanacak sayı giriniz");
        sayi=scan.nextInt();
       while (sayi<500&&sayi>300){

           toplam+=sayi;
           sayac++;
       }
        System.out.println(sayac+"  sayı girdiniz ve toplamları:"+toplam);
    }
}
