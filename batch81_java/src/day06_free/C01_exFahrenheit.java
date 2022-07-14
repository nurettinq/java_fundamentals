package day06_free;

import java.util.Scanner;

public class C01_exFahrenheit {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sıcaklık giriniz:");


        int fahren=scan.nextInt();
        int celcius=(fahren-32)/9*5;
        System.out.println("girdiğiniz sıcaklık:"+celcius+" C");
        System.out.println("girdiğiniz sıcaklık:"+fahren+" f");

    }
}
