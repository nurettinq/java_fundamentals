package day16_forloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
          /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz

           */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz ENTER a basınız");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        sayilariTopla(num1,num2);


        }


    public static void sayilariTopla(int num1, int num2) {
        int topla=0;
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
               topla+=i;
            }
            System.out.println(topla);

        }else{
            for (int i = num2; i <=num1 ; i++) {
                topla+=i;

            }
            System.out.println(topla);
        }
    }
}
