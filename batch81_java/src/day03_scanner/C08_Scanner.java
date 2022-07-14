package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adınızı girirniz");
        char isim=scan.next().toUpperCase().charAt(0);
        System.out.println("ilk harf:"+isim);

    }
}
