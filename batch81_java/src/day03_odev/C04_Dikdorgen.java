package day03_odev;

import java.util.Scanner;

public class C04_Dikdorgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kısa kenarı giriniz \nuzun kenarı giriniz\nyüksekliği giriniz:");
        int kisa= scan.nextInt();
        int uzun=scan.nextInt();
        int yukseklik= scan.nextInt();
        System.out.println("prizmanın hacmi:"+kisa*uzun*yukseklik);
    }
}