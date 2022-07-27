package kendi_kendime;

import java.util.Scanner;

public class C10_KanBagısı {
    public static void main(String[] args) {

		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        if (yas < 18) {
            System.out.println("kan bağışı yapamaz");

        }
        else {
            System.out.println("lütfen kilonuzu giriniz");
            double kilo = scan.nextDouble();


            if (kilo < 50) {
                System.out.println("kan bağışı yapamaz");
            } else {
                System.out.println("kan bağışı yapabilir");
            }
        }

    }
}
