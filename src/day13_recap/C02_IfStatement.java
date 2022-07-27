package day13_recap;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Y ve N ikilisinden birini giriniz ");
        char input=scan.nextLine().charAt(0);
        if(input=='Y'||input=='y'){

                System.out.println("YES");
            }else if (input=='N'||input=='n'){
                System.out.println("NO");
            }else {
            System.out.println("yanlış giriş yaptınız lütfen sadece 'y' ve 'n' den birini giriniz");

        }
    }
}
