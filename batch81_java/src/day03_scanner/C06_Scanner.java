package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz:");
        String isim=scan.nextLine();
        System.out.println("lütfen soyadinizi giriniz :");
        String soyad=scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz:");
       double yas=scan.nextInt();
        System.out.println("girilen bilgiler= "+isim+" "+soyad+" "+yas);
    }
}
