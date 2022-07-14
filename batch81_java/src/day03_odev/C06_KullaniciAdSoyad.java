package day03_odev;

import java.util.Scanner;

public class C06_KullaniciAdSoyad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanıcı adını soyadini giriniz");
        String isim = scan.nextLine();
        scan.nextLine();
        String soyisim = scan.nextLine();
        System.out.println("isim-soyisim :" + isim + " " + soyisim);
    }
}