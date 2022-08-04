package day39_exception;

import java.util.Scanner;

public class C04_Example {
    public static void main(String[] args) {
        System.out.println("sayi giriniz");
        Scanner scan= new Scanner(System.in);
        String sayi=scan.next();
        try {
            System.out.println(Integer.parseInt(sayi)*2);
        } catch (NumberFormatException e) {
            System.out.println("girdiginiz string sayiya cevrilemez");
        }


    }
}
