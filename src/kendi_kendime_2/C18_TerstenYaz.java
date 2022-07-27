package kendi_kendime_2;

import java.util.Scanner;

public class C18_TerstenYaz {

    public static void main(String[] args) {
        String word="";
        terYaz(word);
    }

    private static void terYaz(String word) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        word=scan.nextLine();
        String box="";
        for (int i =  word.length()-1; i >=0; i--) {
            box+=word.substring(i,i+1);

        }
        System.out.println(box);
    }
}
