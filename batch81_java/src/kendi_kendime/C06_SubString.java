package kendi_kendime;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" adınızı ve soyadınızı aralarında bir boşluk bırakarak giriniz");
        String adSoyad=scan.nextLine();

        if (adSoyad.contains("1")||adSoyad.contains("2")||adSoyad.contains("3")||adSoyad.contains("4")||adSoyad.contains("5")
                ||adSoyad.contains("6")||adSoyad.contains("7")||adSoyad.contains("8")||adSoyad.contains("9")||adSoyad.contains("0")){
            System.out.println("sadece harf giriniz");
        }else if (adSoyad.contains(" ")){
            System.out.println(adSoyad.replaceAll("\\w","*"));
        }

    }
}
