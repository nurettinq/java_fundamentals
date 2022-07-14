package kendi_kendime;

import java.util.Scanner;

public class C11_OyKullanma {
    public static void main(String[] args) {
            /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        if (yas>=18){
            System.out.println("oy kullanmaya uygun");
            if (yas<50){
                System.out.println("bir kez oy kulllanabilirsiniz");
            } else if (yas<70) {
                System.out.println("iki kez oy kullanabilir");
            }else{
                System.out.println("üçkez oy kullanaabilirsiniz");
            }
        }
        else{
            System.out.println("oy kullanamazsınız");
        }
    }
}
