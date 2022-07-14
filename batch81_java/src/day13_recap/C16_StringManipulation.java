package day13_recap;

import java.util.Scanner;

public class C16_StringManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine();
        if(kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2));
        }else{
            System.out.println(kelime);
        }
    }
}
