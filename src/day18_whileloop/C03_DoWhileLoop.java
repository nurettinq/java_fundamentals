package day18_whileloop;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // while loop ta önce kontrol edip sonra işlem yaptığımız için loop un kırılamdsi için bir kez daha başa dönmemmiz gerekiyor
        // do while loop ile çaliştığımızda bu avantaj ortadan klakar
        int sayi;
        do {
            Scanner scan = new Scanner((System.in));
            System.out.println("lütfen bir saayi giriniz.");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.print("girilen çift sayi:" + sayi);
            } else System.out.println("benedn bu kadar");
        }
        while (sayi % 2 == 0);
    }
    }

