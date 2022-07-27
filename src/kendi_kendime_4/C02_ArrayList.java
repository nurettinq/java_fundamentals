package kendi_kendime_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ArrayList {
    public static void main(String[] args) {

          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
           */
        List<Integer> not = new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        String dewamke;
        do{
            System.out.println("ogrenci notu giriniz: ");
            not.add(scan.nextInt());
            System.out.println("dewamke E/H");
            dewamke = scan.next();

        }while(dewamke.equalsIgnoreCase("e"));
        int toplam=0;
        for (int i = 0; i < not.size() ; i++) {
            toplam+=not.get(i);

        }
        int sayac=0;
        int ortalama=toplam/not.size();
        for (int i = 0; i < not.size() ; i++) {
            if(not.get(i)>ortalama){
                sayac++;
            }

        }
        System.out.println("girilen notların ortalaması :"+ortalama);
        System.out.println("ortalamayı gecen ogrenci sayısı :"+sayac);
}}
