package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exceptions {
    public static void main(String[] args) {
        String [] urunler={"nutella","çokokrem","süt","çay","fındık"};
        Scanner scan=new Scanner(System.in);
        System.out.println("istediğiniz ürünün sira numarasini giriniz");
        int istenenIndex=0;
        try {
              istenenIndex=scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sadece  sayi giriniz");        }
        try {
            System.out.println("aradıgınız urun :"+urunler[istenenIndex-1]);
        } catch (Exception e) {
            System.out.println();
        }
    }
}
