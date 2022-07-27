package day05_matematiksel;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        // kullanıcıdan dör basamaklı br sayi alıp rakamların toplamını bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();
        int sayi1=sayi%10;
        int sayi2=sayi/10;
        int sayi3=sayi2%10;
        int sayi4=sayi2/10;
        int sayi5=sayi4%10;
        int sayi6=sayi4/10;
        int sayi7=sayi6%10;
        int sayi8=sayi6/10;
        System.out.println("rakamlar toplamı:"+(sayi1+sayi3+sayi5+sayi7));


    }
}
