package day17_forloop;

public class C06_Forloop {
      /*
          verilen yukseklik ve boy degerine gore
          *'lardan olusan bir dikdortgen olusturalim
          yukseklik :3  boy:4
          * * * *
          * * * *
          * * * *
         */

    public static void main(String[] args) {
        int yukseklik=3;
        int genislik=4;
        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=genislik ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
