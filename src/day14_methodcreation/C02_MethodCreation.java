package day14_methodcreation;

import java.sql.SQLOutput;

public class C02_MethodCreation {
    public static void main(String[] args) {
           //verilen üç basamaklı bir sayının rakamlarını yazdıranbir method bir sayı yazzın
        int input=453;
        rakamlariTopla(input);
        C01_Methodcreation.tersteYazdır("salo");

    }

    public static void rakamlariTopla(int input) {
        int birlerBasamak=0;
        int rakamlarToplami=0;
        int temp=input;
        birlerBasamak=input%10;
        rakamlarToplami=rakamlarToplami+birlerBasamak;
        input/=10;
        birlerBasamak=input%10;
        rakamlarToplami=rakamlarToplami+birlerBasamak;
        input/=10;
        birlerBasamak=input%10;
        rakamlarToplami=rakamlarToplami+birlerBasamak;
        input/=10;
        System.out.println("girdiginiz "+temp+" sayısının rakamlar toplamı: "+rakamlarToplami);



    }
}
