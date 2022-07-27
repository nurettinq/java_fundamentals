package day06_wrapperconca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Wrapper {
    public static void main(String[] args) {
        String str="java ile hayat ne güzel";
        System.out.println(str.toUpperCase());
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz:");
        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen sifreniin 3 fazlası:"+(sifre+3));
        System.out.println("girilen şifrenin 3 fazlası:"+(sifreSayi+3));

    }

}
