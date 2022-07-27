package day11_stringmanipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // kullanıcıdan gmail adresi isteyin.
        // @gmail.com  ile bitiyorsa em ail adresiniz kaydedildi
        // @gmail.com bitmiyorsa  lütfen gmail adresi giriniz
        // @gmail.com içermiyorsa lütfen yazınızı kontrol edin


        Scanner scan =new Scanner(System.in);
        System.out.println(" lütfen email giriniz");
        String email = scan.nextLine();
        if(!email.contains("@gmail.com")){
            System.out.println("lütfen gmail adresi giriniz");


        }else if(email.lastIndexOf("@gmail.com")==email.length()-10){
            System.out.println("email adresiniz kaydedildi");


        }else {
            System.out.println("lütfen yazınızı kontrol edin");

        }
    }
}
