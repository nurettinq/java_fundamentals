package kendi_kendime_3;

import java.util.Scanner;

public class C12_AsalSayi {

    public static void main(String[] args) {
        //  Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
        // -->> Asal sayi : 1 ve kendisinden başka böleni olmayan sayılardır
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen asal sayi olup olmadigini \nogrenmek istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();
        int s=asalMi(sayi);
        System.out.println(s);

    }
    private static int asalMi(int sayi) {
        int sayac = 0;
        boolean dogruMu = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(true);
        } else
            System.out.println(false);
        return sayac;
    }
}
