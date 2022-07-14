package day05_matematiksel;

import java.util.Scanner;

public class C04_RakamlarTop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakamlarToplamı=0;
        int birlerBasamagi=0;
        int ilkGirilensayi=sayi;
        birlerBasamagi=sayi%10;
        rakamlarToplamı+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;
        rakamlarToplamı+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;
        rakamlarToplamı+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;

        sayi/=10;
        System.out.println(ilkGirilensayi+" sayisinın rakamlar toplamı:"+rakamlarToplamı);

    }
}
