package kendi_kendime_2;

import java.util.Scanner;

public class C06_SilinecekHarf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz: ");
        String word=scan.next();
        System.out.println("silinecek harfi giriniz");
        char harf=scan.next().charAt(0);
        String word2="";
        String box="";
        for (int i = 0; i <word.length(); i++) {
            if(harf==word.charAt(i)) {
               box+=harf;
            }else {
                word2+=word.charAt(i);
            }


        } System.out.println(word2);




    }
}
