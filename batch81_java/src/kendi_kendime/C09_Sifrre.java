package kendi_kendime;

import java.util.Scanner;

public class C09_Sifrre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen şifrenizi giiriniz");
        String sifre=scan.nextLine();


        if(!(sifre.indexOf(0)>='A'||sifre.indexOf(0)<='Z')){
            System.out.println("1 işlem başarısız, lütfen yeniden deneyiniz");

        }
        else if(!(sifre.indexOf(sifre.length()-1)>='a'||sifre.indexOf(sifre.length()-1)<='z')){
            System.out.println("2 işlem başarısız, lütfen yeniden deneyiniz");
        }
        else if((sifre.contains(" "))){
            System.out.println("3 işlem başarısız, lütfen yeniden deneyiniz");
        }
        else if (sifre.length()<8) {
            System.out.println("4 işlem başarısız, lütfen yeniden deneyiniz");
        }
        else {
            System.out.println("işlem başarı ile tamamlandı");
        }

    }
}
