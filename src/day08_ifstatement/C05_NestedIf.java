package day08_ifstatement;

import java.util.Scanner;

public class C05_NestedIf {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("lütfen şifrenizi giiriniz");
            String sifre=scan.nextLine();
            char ilkHarf=sifre.charAt(0);

            if(ilkHarf>='A'&&ilkHarf<='Z'){
                if ( ilkHarf=='A'){
                    System.out.println("geçerli şifre");
                }else{
                    System.out.println("geçersiz şifre");
                }

            }else if( ilkHarf>='a'&& ilkHarf<='z'){
                if ( ilkHarf=='z'){
                    System.out.println("geçerli şifre");
                }else{
                    System.out.println("geçersiz şifre");
                }


            }else {
                System.out.println("lütfen ilk karakter için sadece haarf kullanın");
            }
        }
    }


