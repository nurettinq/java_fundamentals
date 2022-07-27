package day11_stringmanipulation;

import java.util.Scanner;

public class C06_EndsWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("email adresinizi giriniz");
        String str=scan.nextLine();
        if (str.contains("gmail.com")){
            System.out.println("\"email adresiniz kaydedildi\"");
        }
        else if(!str.endsWith("@gmail.com")) {
            System.out.println("\'lütfen email adresi giriniz\'");

        }else {
            System.out.println("lütfen yazınızı giriniz");
        }
    }
}
