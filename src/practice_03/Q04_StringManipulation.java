package practice_03;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi girin");
        String isim= scan.next();
        String soy=scan.next();
        if (isim.length()>soy.length()){
            System.out.println("isminiz soyisiminizden daha uzundur");
        }else if(isim.length()==soy.length()){
            System.out.println("isminiz soyisminize eşit");

        }else
            System.out.println("soy isminiz daha uzun");
    }
}
