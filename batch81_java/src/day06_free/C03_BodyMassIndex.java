package day06_free;

import java.util.Scanner;

public class C03_BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen boyunuzu ve kilonuzu giriniz:");
        double height=scan.nextDouble();
        scan.nextLine();
        double mass=scan.nextDouble();
        System.out.println("body mass index:"+mass/(height*height));
    }
}
