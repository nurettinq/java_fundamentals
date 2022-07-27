package day03_odev;

import java.util.Scanner;

public class C01_Cember {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yarıcap giriniz:");
        double yaricap=scan.nextDouble();
        System.out.println("cemberin cevresi:"+(2*3.14*yaricap)+"\ndairenin alanı:"+(yaricap*yaricap*3.14));

    }
}
