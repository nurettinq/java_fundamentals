package zoom;

import java.util.Scanner;

public class C01_Task {
    public static void main(String[] args) {

        /*sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
        DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.






          TASK :
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
        System.out.println("matris satır veya sutun sayısını giriniz: ");
        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();

        for (int i=1; i<=num; i++){
            for (int j = 1; j <=num ; j++) {
                if(i==j){
                    System.out.print("1");
                }else System.out.print("0");


            }
            System.out.println("");
        }

    }
}
