package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double num=scan.nextDouble();
        if(num>0) {
            System.out.println(num);
        }else {
            System.out.println("lütfen bir sayı daha giriniz");
            double num2=scan.nextDouble();
            System.out.println(num*num2);
            // eğer if else içerisinde kodlar varsa ternary ile yapamayız

        }


    }
}
