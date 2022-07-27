package day08_ifstatement;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört basamaklın bir sayı giriniz");
        int num=scan.nextInt();
        if((num<1000)||(num>9999)){
            System.out.println("lütfen geçerli bi sayi giriniz");
        }
        else if (num%5==0){
            if(num%10==0) {
                System.out.println("5 e bölünen çift sayı");
            }else {
                System.out.println("5 e bölünen teksayı");
            }
        }else {
            System.out.println("tekrar deneyin");
        }
    }
}
