package kendi_kendime_2;

public class C05_Amsttrong {
    public static void main(String[] args) {


    int b1, b2, b3, b4, b5, sonuc;
        for (int i = 1; i <=99999; i++) {
        if (i <= 9) {  // Tek basamaklı Sayı aralığı
            sonuc = i * i;
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 99) {   // iki Basamaklı Sayı Aralığı
            b1 = (i / 10) % 10;
            b2 = i % 10;
            sonuc = (b1 * b1) + (b2 * b2);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 999) {  // 3 Basamaklı Sayı aralığı
            b1 = (i / 100) % 10;
            b2 = (i / 10) % 10;
            b3 = i % 10;
            sonuc = (b1 * b1 * b1) + (b2 * b2 * b2) + (b3 * b3 * b3);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 9999) {    // 4 Basamaklı Sayı Aralığı
            b1 = (i / 1000) % 10;
            b2 = (i / 100) % 10;
            b3 = (i / 10) % 10;
            b4 = i % 10;
            sonuc = (b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        } else if (i <= 99999) {   // 5 Basamaklı Sayı aralığı
            b1 = (i / 10000) % 10;
            b2 = (i / 1000) % 10;
            b3 = (i / 100) % 10;
            b4 = (i / 10) % 10;
            b5 = i % 10;
            sonuc = (b1 * b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4 * b4) + (b5 * b5 * b5 * b5 * b5);
            if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
        }
    }
}
}

