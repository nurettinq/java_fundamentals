package kendi_kendime;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üç sayı giriniz");
        double inputX=scan.nextDouble();
        double inputY=scan.nextDouble();
        double inputZ=scan.nextDouble();

        if (inputX>inputY && inputX>inputZ && inputY>inputZ){
            System.out.println("girdiginiz sayılar azalan sıradadır");

        }else if (inputZ>inputY && inputZ>inputX&& inputY>inputX){
            System.out.println("girdiğniz sayılar artan sıradadır");
        }else {
            System.out.println("girdiğniz sayılar ne artan nede azalan sıradadır");
        }
    }

}
