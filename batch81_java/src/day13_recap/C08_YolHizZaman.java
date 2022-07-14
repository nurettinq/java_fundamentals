package day13_recap;

import java.util.Scanner;

public class C08_YolHizZaman {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("mesafeyi (km) giriniz :");
        double mesafe=scan.nextDouble();
        System.out.println("ortalama hızı (km/s) giriniz :");
        double hiz=scan.nextDouble();
        System.out.println("ortalama " +Math.round(mesafe/hiz)+" saate varırsınız");
    }
}
