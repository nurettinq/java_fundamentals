package kendi_kendime;

import java.util.Scanner;

public class C15_WhileLoop {
    public static void main(String[] args) {
        System.out.println("lütfen baslangıc ve bitiş degerlerini giriniiz");
        Scanner scan=new Scanner(System.in);
        int bas= scan.nextInt();
        int bit=scan.nextInt();
        int i=bas;
        while(i<bit){
            if (i%2==0){
                System.out.println(i+" ");
            }
            i++;
        }







        }
    }





