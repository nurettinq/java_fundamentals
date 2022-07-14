package kendi_kendime;

import java.util.Scanner;

public class C14_Good {
    public static void main(String[] args) {
                    /*
                   kullanıcıdan aldıgınız sayı ile, yine kullanıcının secimine göre islem yapınız
                    1-Asal sayi mi kontrol et
                    -->>1 ve kendisinden başka böleni olmayan sayılardır
                    2-Fibonacci dizisini yazdir
                     --->> (0, 1, 1 , 2, 3, 5, 8, 13, 21, 34, 55, 89,)
                    3-palindrome mu kontrol et
                    --->>> Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir. (212,1001,1991)
                    4-Faktoryel degerini bul
                    ---> 5 sayısının faktöriyeli 5!=5*4*3*2*1=120
                    5-Tam bolenleri kac tane
                   -->>20  1-2-4-5-10-20  20 sayısının 6 tane tam böleni vardır.
                   */
        System.out.println("****** İŞLEM MAKİNASINA HOŞGELDİNİZ **********");
        Scanner scan = new Scanner(System.in);
        System.out.println("-->Yapmak istedğiniz işlemi seçiniz --<\nAsal sayı olup olmadığını kontrol etmek için 1\n" +
                "Fibonacci dizisini yazdırmak için 2\nPalindrome olup olmadığını kontrol etmek için 3\nFaktöriyel değerini hesaplamak için 4\n" +
                "Tam bölenlerini bulmak için 5 tuşlayınız.");
        int secim= scan.nextInt();
        System.out.println("İşlem yapmak istediğiniz tam sayıyı giriniz : ");
        int sayi= scan.nextInt();
        switch (secim){
            case 1: asalMi(sayi);break;
            case 2: fibonacciYazdir(sayi);break;
            case 3: palindromeMu(sayi);break;
            case 4: faktoriyelDegeri(sayi);break;
            case 5: TamBolenleri(sayi);break;
            default:
                System.out.println("geçerli seçim yapınız!!");
        }
    }//main sonu
    private static void TamBolenleri(int sayi) {//20 1 2 4 5 10 20
        int tamBolenSayisi=0;
        System.out.print("tam bölenleri : ");
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                tamBolenSayisi++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(sayi+" sayısının "+tamBolenSayisi+" tane tam böleni vardır.");
    }
    private static void faktoriyelDegeri(int sayi) {//5!=1*2*3*4*5=120
        int faktoriyel=1;
        if (sayi<=0){
            System.out.println("geçersiz sayı");
        }else{
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;
            }
            System.out.println(sayi+" sayisinin faktöriyel hesabı : "+faktoriyel);
        }}
    private static void palindromeMu(int sayi) {// 212,1991
        String sayi1=sayi+"";
        String terstenSayi="";
        for (int i = sayi1.length()-1; i>=0 ; i--) {
            terstenSayi+=sayi1.charAt(i);}
        if (sayi1.equals(terstenSayi)){
            System.out.println(sayi+" sayısı palindromedur.");
        }else
            System.out.println(sayi+" sayısı palindrome değildir.");
    }
    private static void fibonacciYazdir(int sayi) {// 0 1 1 2 3 5 8 13 21 34 55
        int num1=0, num2=1, num3=0;
        boolean dogruMu=false;
        //System.out.print(num1+" "+num2);
        for (int i = 3; i <=sayi ; i++) {
            num3=num1+num2;
            //System.out.print(" "+num3);
            num1=num2;
            num2=num3;

            }if (sayi==num3){
            System.out.println("fibonacci");
        }
       else {
            System.out.println("degil");
        }
    }
    private static void asalMi(int sayi) {
        int sayac=0;
        for (int i = 2; i <sayi ; i++) {
            if ( sayi%i==0){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(sayi+" asaldır");
        }else
            System.out.println(sayi+" asal değildir.");
    }
}//class sonu

