package qa_team_10;


import java.util.Scanner;

public class C06_FrankfurtKoln {
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
        int biletAdet;
        double bakiye;
        int frankfurtKm = 80;
        int kolnKm = 60;
        int km20birimFiyat = 5;
        double frankfurtTutar;
        double kolnTutar;
        double tutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz:" +
                "\n frankfurt:80 km -----koln: 60 km" +
                "\n (20 km başına 5 euron alınmaktadır)");
        rota = scan.next().toUpperCase();
        System.out.println();
        switch (rota) {
            case "FRANKFURT":
                frankfurtTutar = frankfurtKm / 20 * km20birimFiyat;
                System.out.println("Frankfurt " + frankfurtTutar + "Euro");
                break;
            case "KOLN":
                kolnTutar = kolnKm / 20 * km20birimFiyat;
                System.out.println("Köln " + kolnTutar + "Euro");
                break;
            default:
                System.out.println("lütfen rotanızı doğru belirleyiniz");

        }
        System.out.println("kaç kişilik bilet istiyorsunuz. (max iki kişiilik)");
        biletAdet = scan.nextInt();
        if (biletAdet == 1) {
            switch (rota) {
                case "FRANKFURT":
                    frankfurtTutar = frankfurtKm / 20 * km20birimFiyat;
                    System.out.println("Frankfurt " + frankfurtTutar + "Euro");
                    break;
                case "KOLN":
                    kolnTutar = kolnKm / 20 * km20birimFiyat;
                    System.out.println("Köln " + kolnTutar + "Euro");
                    break;
                default:
                    System.out.println("lütfen rotanızı doğru belirleyiniz");


            }

        } else if (biletAdet == 2) {
            switch (rota) {
                case "FRANKFURT":
                    frankfurtTutar = frankfurtKm / 20 * km20birimFiyat * 2;
                    System.out.println("Frankfurt " + frankfurtTutar + "Euro");
                    break;
                case "KOLN":
                    kolnTutar = kolnKm / 20 * km20birimFiyat * 2;
                    System.out.println("Köln " + kolnTutar + "Euro");
                    break;
                default:
                    System.out.println("lütfen rotanızı doğru belirleyiniz");

            }


        } else {
            System.out.println("lütfen kişi sayısını doğru giriniz max 2 kişilik");
        }
    }
}



