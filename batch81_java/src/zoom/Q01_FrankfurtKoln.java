package zoom;

import java.util.Scanner;

public class Q01_FrankfurtKoln {
    public static void main(String[] args) {
        /* SORU 1:
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
        to do İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
                İşlemlerde direkt bunları cağırabilirsiniz.

        "Nereye yolculuk etmek istiyorsunuz?
        (Frankfurt : 60 KM          ---         Köln : 80 KM ---
                (20 KM başınab  5 euro bilet parası alınmaktadir..)    yazısı gelsin.

        1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

        to do Frankfurt girildiyse, örn:

        girdi= Frankfurt

        case=FRANKFURT:

        Rota = Frankfurt yazdırın.
                Frankfurt km hesabı işlemi yapın.

        son olarak konsolda: Frankfurt 15 Euro         yazsın.
          KÖLN ise

        "Rota = Köln" yazdırın.
                km hesabına göre işlemi yapınız.

        son olarak konsolda:  Köln   20 Euro             yazsın.



        2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

        case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.

        ** bakiye biilgisini girin




      check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

        */
        String rota;
        int biletAdedi;
        double bakiye;
        double frankfurtTutar;
        double kolnTutar;
        double toplamTutar;
        double paraUstu;
        int kolnKm = 80;
        int frankfurtKm = 60;
        int birimFiyat20Km = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz?\n" +
                "        (Frankfurt : 60 KM          ---         Köln : 80 KM ---\n" +
                "                (20 KM başınab  5 euro bilet parası alınmaktadir..)");
        rota = scan.next().toUpperCase();
        if (!(rota.equals("FRANKFURT") || rota.equals("KOLN"))) {
            System.out.println("rotanızı gözden geçiriniz");
        } else {
            System.out.println("biletiniz kaç kişilik olsun(max iki kişilik):");
            biletAdedi = scan.nextInt();
            if (biletAdedi < 1 || biletAdedi > 2) {
                System.out.println("kişi sayısını kontrol ediniz max iki kişilik");
            } else {
                System.out.println("bakiyeniz: ");
                bakiye = scan.nextDouble();
                switch (rota) {
                    case "FRANKFURT":
                        frankfurtTutar = frankfurtKm / 20 * birimFiyat20Km;
                        toplamTutar = frankfurtTutar * biletAdedi;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye < toplamTutar) {
                            System.out.println("bakiye yetersiz !!!");
                        } else {
                            System.out.println(rota + " a " + biletAdedi + " kişilik" +
                                    "\n bakiye:" + bakiye + "" + "" +
                                    "\n toplam tutar:" + toplamTutar +
                                    "\n para üstü: " + paraUstu);

                        }
                        break;

                    case "KOLN":
                        kolnTutar = kolnKm / 20 * birimFiyat20Km;
                        toplamTutar = kolnTutar * biletAdedi;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye < toplamTutar) {
                            System.out.println("bakiye yetersiz !!!");
                        } else {
                            System.out.println(rota + " e " + biletAdedi + " kişilik" +
                                    "\n bakiye:" + bakiye + "" + "" +
                                    "\n toplam tutar:" + toplamTutar +
                                    "\n para üstü: " + paraUstu);

                        }
                        break;

                }
            }

        }
    }
}