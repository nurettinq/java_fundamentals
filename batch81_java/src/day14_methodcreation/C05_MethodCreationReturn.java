package day14_methodcreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        //kullanıcıdan şehir ismin ve doğym tariihini allın
        //şehir ismini programımızda şehir ismini büyük harf tarihide 2022-06-25şekllinde alıp
        // bunları programda kullanacagımız formatta bir metot oluşurturun
        String sehir=sehirAl();
        String dogumTarih=tarihAl();
        System.out.println("girdiginiz şehir: " + sehir);
        System.out.println("girdiginiz tarih: " + dogumTarih);


    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl giriinz");
        int yil=scan.nextInt();
        if(yil<2100&&yil>1900){
            tarih=yil+"-";

        }else{
            System.out.println("lütfengeçerli bir yıl giriniz");
        }
        System.out.println("kaçıncı ay oldugunu sayı olarak yazın");
        int ay=scan.nextInt();
        if(ay<0||ay>12){
            System.out.println("ay 1-12 arasında olmalıdır");
        }else if(ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("lütfen bir gün giriniz");
        int gun= scan.nextInt();
        if(gun<0||gun>31){
            System.out.println("lütfen geçerli bir gün giriniz");
        }else if(gun<10){
            tarih=tarih+"0"+gun;
        }else{
            tarih=tarih+gun;

        }
        return tarih;

    }

    public static String sehirAl() {
        Scanner scn=new Scanner(System.in);
        System.out.println("lütfen şehir ismi giriniz");
        String sehirAdi=scn.next().toUpperCase();
        return sehirAdi;


    }
}
