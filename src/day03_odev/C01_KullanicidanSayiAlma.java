package day03_odev;

import java.util.Scanner;

public class C01_KullanicidanSayiAlma {
    public static void main(String[] args) {
        //kullanıcıdan iki tamsayi alıp bunların toplamı, faaarkı, çarpımını yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz \n aralarda enter a basin");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(a*b+","+(a-b)+","+(a+b));
        System.out.println();
    }
}
