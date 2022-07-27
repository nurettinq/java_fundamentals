package day13_recap;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("şütfen beş basamaklı bir sayı giriniz");
        int num=scan.nextInt();
        int ilkIki=num/1000;
        int sonIki=num%100;
        System.out.println(ilkIki%10+ilkIki/10+sonIki/10+sonIki%10);
    }
}
