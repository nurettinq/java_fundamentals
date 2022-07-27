package day03_odev;

import java.util.Scanner;

public class C02_Kare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenarını giriniz:");
        double kenar=scan.nextDouble();
        System.out.println("karenin alanı:"+kenar*kenar+"\nkarenin çevresi:"+(4*kenar));
    }
}
