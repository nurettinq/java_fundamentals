package kendi_kendime;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {

                    // ortalamadan büyük olan sayıları yazdırma
        Scanner scan=new Scanner(System.in);
        System.out.println("beş adet sayı giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();
        double num4=scan.nextDouble();
        double num5=scan.nextDouble();
        double ort=(num1+num2+num3+num4+num5)/5;
        System.out.println("ortalama:"+ort);
        if(num1>ort){
            System.out.println(num1);
        }
        if(num2>ort) {
            System.out.println(num2);
        }
        if(num3>ort) {
            System.out.println(num3);
        }
        if(num4>ort) {
            System.out.println(num4);
        }
        if(num5>ort) {
            System.out.println(num5);
        }
    }
}
