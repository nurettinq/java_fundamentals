package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kulllanıcıdan iki sayi alıp çarpımını yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ilk sasyiyi girin:");
        double sayi1=scan.nextDouble();
        System.out.println("lütfen ikinci sasyiyi girin:");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayiların çarpımı:"+sayi1*sayi2);


    }
}
