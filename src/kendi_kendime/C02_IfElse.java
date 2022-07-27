package kendi_kendime;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
                  //kullanıcıdan alınan iki değerin virgülden sonra üç basamaka kadar aynı olup olmadıgını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("input floating-point number");
        double x=scan.nextDouble();
        System.out.println("input another floating-point number");
        double y=scan.nextDouble();
        x=Math.round(x*1000);
        x=x/1000;
        y=Math.round(y*1000);
        y=y/1000;
        if (x==y){
            System.out.println("the same number");
        }else {
            System.out.println("the different number");

        }
    }
}
