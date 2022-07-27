package kendi_kendime_3;

import java.util.Scanner;

public class C07_Task_1 {
    public static void main(String[] args) {
       /*  TASK :
        Matrisin boyutunu kullanıcıdan okuyup.
        Sadece diyagonu (köşegeni) 1 olan ve
        diğer elemanları 0 olan bir kare matrisi ekrana bastırın.
        Ekran Çıktısı
        Bir say ı giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001
        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int num=scan.nextInt();
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                if(i==j){
                    System.out.print(1);
                }else System.out.print(0);

            }
            System.out.println("");

        }
    }
}
