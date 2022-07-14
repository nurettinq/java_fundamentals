package kendi_kendime;

import java.util.Scanner;

public class C18_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi=scan.nextInt();
        int toplam=0;
        int sonBasamak=0;
        for (int i = 0; i <sayi; i++) {
            sonBasamak=sayi%10;
            sayi=sayi/10;
            toplam+=sonBasamak;


        }
        System.out.println(toplam);
    }
}
