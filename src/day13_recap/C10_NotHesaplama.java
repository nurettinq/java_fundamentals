package day13_recap;

import java.util.Scanner;

public class C10_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
     Scanner scan=new Scanner(System.in);
     int vize1;
     int vize2;
     int finalNot;
        System.out.println("birinci vize: ");
        vize1=scan.nextInt();
        System.out.println("ikinci  vize: ");
        vize2=scan.nextInt();
        System.out.println("final not : ");
        finalNot=scan.nextInt();
        double sonuc=(vize1+vize2)/2*0.3+finalNot*0.7;
        System.out.println("sonuc : "+sonuc);

    }
}
