package day16_forloop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
         /*
    Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
    1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
    Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("yüzden kucuk bir sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi < 100 && sayi >=0) {
            for (int i = 0; i <= sayi; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("java güzeldir" );
                } else if (i % 5 == 0) {
                    System.out.println("güzeldir" );
                } else if (i % 3 == 0) {
                    System.out.println("java" );
                } else {
                    System.out.println(i);
                }

            }
        } else {
            System.out.println("lütfen 0 ila 100 arasında bir sayı giriniz");
        }                            
    }
}
