package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin girilen ismi isminiz şeklinde yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");
        String kullaniciAdi=scan.next();
        System.out.println("adiniz:"+kullaniciAdi);


    }
}
