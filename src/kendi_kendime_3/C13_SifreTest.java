package kendi_kendime_3;

import java.util.Scanner;

public class C13_SifreTest {
    public static void main(String[] args) {
             /*
        Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
        */


      Scanner scan = new Scanner(System.in);
      System.out.println("sifre giriniz");
      boolean hataliMi = true;
      boolean kucukMu=false;
      boolean buyukMu=false;
      boolean ozelMi=false;

      String ozelKarakter="";
      for (char i = 0; i <=255 ; i++) {
          ozelKarakter+=i;

      }
      ozelKarakter=ozelKarakter.replaceAll("\\w","");
      //   System.out.println(ozelKarakter);


      do {
          String sifre = scan.nextLine();

          for (int i = 0; i < sifre.length(); i++) {

              if (sifre.charAt(i) <= 'z' && sifre.charAt(i) >= 'a') {
                  kucukMu=true;
              };

          }
          for (int i = 0; i < sifre.length(); i++) {
              if (sifre.charAt(i) <= 'Z' && sifre.charAt(i) >= 'A') {
                  buyukMu=true;

              }

          }
          for (int i = 0; i <sifre.length() ; i++) {
              if (ozelKarakter.contains(sifre.substring(i,i+1))){
                  ozelMi=true;
              }

          }

          if (sifre.length()<=8){
              System.out.println("sifre en az sekiz karakter olmalıdır");
          }

          if (kucukMu==false){
              System.out.println("Sifre kucuk harf icermelidir");}
          if (buyukMu==false){
              System.out.println("Sifre buyuk harf icermelidir");}
          if (ozelMi==false){
              System.out.println("sifre ozel karakter icermelidir");}

          if (kucukMu==true&&buyukMu==true&&ozelMi==true&&sifre.length()>=8){
              hataliMi=false;
          }

      } while (hataliMi);
        System.out.println("sifreniz kabul edilmiştir");
    }


}
