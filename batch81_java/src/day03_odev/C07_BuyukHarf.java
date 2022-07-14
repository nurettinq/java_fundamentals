package day03_odev;

import java.util.Scanner;

public class C07_BuyukHarf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adinizi giriniz:");
        char ad=scan.next().toUpperCase().charAt(2);
        System.out.println("üçüncüharf:"+ad);


    }
}
