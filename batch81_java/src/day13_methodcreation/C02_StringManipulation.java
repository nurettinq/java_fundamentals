package day13_methodcreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;
        if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') {
            kontrol++;
        }else{
            System.out.println("ilk harf büyük olmalı");
        }
        if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z') {
            kontrol++;
        }else{
            System.out.println("son harfi küçük olmalı");
        }
        if(sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
        }else{
            kontrol++;
        }
        if(sifre.length()>=8){
            kontrol++;
        }
        else {
            System.out.println("şifre en az 8 haneli olmalı");
        }
        if (kontrol==4){
            System.out.println("şifre başarı ile oluşturuldu");
        }else{
            System.out.println("işlem başarısız. lütfen yeni bir şifre girin");
        }

    }
}
