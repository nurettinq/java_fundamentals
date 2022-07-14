package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
      // kullanıcıdan bir sayi alın mutlak değerini yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double num=scan.nextDouble();
        System.out.println((num>=0?num:(-1*num)));
    }
}
