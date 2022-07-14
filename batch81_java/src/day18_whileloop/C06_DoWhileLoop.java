package day18_whileloop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pozitifSayiAdedi = 0;
        int pozitifSayiToplami = 0;
        int negatifSayiAdedi = 0;
        int sayi;
        do {
            System.out.println(" lütfen pozitif bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozitifSayiToplami += sayi;
                pozitifSayiAdedi++;

            } else if (sayi < 0) {
                negatifSayiAdedi++;
                System.out.println(" negatif sayi girdiniz");
            }
        } while (sayi != 0);
        System.out.println(pozitifSayiAdedi+" sayi girdiniz ve toplamları :"+pozitifSayiToplami);
        System.out.println(negatifSayiAdedi+" negatif sayi girdiniz");

    }
}
