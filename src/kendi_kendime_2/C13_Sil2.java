package kendi_kendime_2;

import java.util.Scanner;

public class C13_Sil2 {
    public static void main(String[] args) {
        String word="";
        sil(word);
        System.out.println(sil(word));
    }

    private static String sil(String word) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String word2= scan.nextLine();
        System.out.println("silinecek kelimeyi giriniz");
        char harf=scan.next().charAt(0);
        String harf2=harf+"";
        System.out.println(word2.replaceAll(harf2,"")        );
        String box="";
        for (int i = 0; i <word2.length(); i++) {
            if (harf==word2.charAt(i)) {
                box+=harf;
            }else {
                word+=word2.charAt(i);
            }
        }

        System.out.println(word);
        return word;
    }
}
