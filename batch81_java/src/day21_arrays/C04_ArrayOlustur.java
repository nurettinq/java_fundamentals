package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        // kullanlıcıdan bir arrray in boyutunu ve tüm  elemanlarını alarak
        // bunu bize döndüren bir metod yazınız
        int[] sayilar=arrayOlustur();
        System.out.println(Arrays.toString(sayilar));

    }

    private static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kaç elamnlı bir array istiyorsun");
        int uzunluk=scan.nextInt();
        int [] olusturulan=new int[uzunluk];

        for (int i=0; i<uzunluk; i++) {
            System.out.println(i+"inci index için asyi giriniz");
            olusturulan[i]=scan.nextInt();
        }
        return olusturulan;

    }
}
