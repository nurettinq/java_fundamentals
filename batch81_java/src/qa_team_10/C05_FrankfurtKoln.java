package qa_team_10;

import java.util.Scanner;

public class C05_FrankfurtKoln {
    public static void main(String[] args) {
        //"Nereye yolculuk etmek istiyorsunuz?
        //(Frankfurt : 60 KM          ---         Köln : 80 KM ---
        //      (20 KM başına 5 euro bilet parası alınmaktadir..)

       String rota;
       int biletAdedi;
        double bakiye;
        int frankfurtKm = 60;
        int kolnKm = 80;
        int km20BirimFiyatEuro = 5;
        int kolnFiyat = 0;
        int frankfurtFiyat = 0;
        int toplamTutar = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz? " +
                "\n( Frankfurt:60 km   ---  Köln:80 km)" +
                "\n(20 km başona 5 euro bilet parası alınmaktadır)");
      rota = scan.next().toUpperCase();
            System.out.println("Kaç kişilik bilet istiyorsunuz   (max iki kişilik)");
            biletAdedi = scan.nextInt();
            System.out.println("bakiyeniz ne kadar?");
            bakiye = scan.nextDouble();
            double paraUstu;
            switch (rota) {
                case "FRANKFURT":
                    frankfurtFiyat = frankfurtKm / 20 * km20BirimFiyatEuro;
                    if (biletAdedi == 1) {
                        toplamTutar = frankfurtFiyat;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye >= toplamTutar) {
                            System.out.println(rota.toLowerCase() + " 1 kişilik: " + toplamTutar);
                            System.out.println("bakiyeniz :" + bakiye);
                            System.out.println("paraUstu :" + paraUstu);
                        } else {
                            System.out.println("bakiyeniz yetersiz!!!");
                        }
                    } else if (biletAdedi == 2) {
                        toplamTutar = frankfurtFiyat * 2;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye >= toplamTutar) {
                            System.out.println(rota.toLowerCase() + " 2 kişilik: " + toplamTutar);
                            System.out.println("bakiyeniz :" + bakiye);
                            System.out.println("paraUstu :" + paraUstu);
                        } else {
                            System.out.println("bakiyeniz yetersiz!!!");
                        }
                    } else {
                        System.out.println("lütfen bilet  adedini doğru giriniz");
                    }
                    break;
                case "KOLN":
                    kolnFiyat = kolnKm / 20 * km20BirimFiyatEuro;
                    if (biletAdedi == 1) {
                        toplamTutar = kolnFiyat;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye >= toplamTutar) {
                            System.out.println(rota.toLowerCase() + " 1 kişilik: " + toplamTutar);
                            System.out.println("bakiyeniz :" + bakiye);
                            System.out.println("paraüstü :" + paraUstu);
                        } else {
                            System.out.println("bakiyeniz yetersiz!!!");
                        }
                    } else if (biletAdedi == 2) {
                        toplamTutar = kolnFiyat * 2;
                        paraUstu = bakiye - toplamTutar;
                        if (bakiye >= toplamTutar) {
                            System.out.println(rota.toLowerCase() + " 2 kişilik: " + toplamTutar);
                            System.out.println("bakiyeniz :" + bakiye);
                            System.out.println("paraüstü :" + paraUstu);
                        } else {
                            System.out.println("bakiyeniz yetersiz!!!");
                        }
                    } else {
                        System.out.println("lütfen bilet  adedini doğru giriniz");
                    }
                    break;
                default:
                    System.out.println("lütfen rotanızı doğru belirleyiniz");

            }

        }
    }

