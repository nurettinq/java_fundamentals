package kendi_kendime_3;

import java.util.Scanner;

public class C03_Sesli2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String harf=scan.nextLine();

        if(harf.length()==1) {
                    char harf1 = harf.charAt(0);
                    for (int i = 0; i <255 ; i++) {
                        if(i==harf1){

                        System.out.println(!(harf1 >= 'a' && harf1 <= 'z') ? "yanlış karakter" : (harf1 == 'a' || harf1 == 'e' || harf1 == 'o' || harf1 == 'u' || harf1 == 'i') ? "sesli" : "sessiz");
                        }
                    }
                }else System.out.println("yanlış karakter");
    }
}

