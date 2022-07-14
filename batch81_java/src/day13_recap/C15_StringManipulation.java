package day13_recap;

import java.util.Scanner;

public class C15_StringManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine().toUpperCase();
        System.out.println("lütfen soy isminizi giriniz");
        String soy=scan.nextLine().toUpperCase();
        System.out.println(isim+" "+soy);

    }
}
