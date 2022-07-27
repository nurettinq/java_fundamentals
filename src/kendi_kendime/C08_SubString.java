package kendi_kendime;

import java.util.Scanner;

public class C08_SubString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim giriniz");

        String str= scan.nextLine();
        if(!(str.contains("a") || str.contains("Z"))) {
            System.out.println("girdiğiniz isim a ve Z içermiyor");

        }else if (str.contains("a")){
            System.out.println("girdiğiniz isim a harfi içeriyor");

        }
        else if (str.contains("Z")){
            System.out.println("girdiğiniz isim Z harfi içeriyor");
        }

        }
    }

