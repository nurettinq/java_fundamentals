package ornek_sorular;
import java.util.Scanner;

public class C01_proje2 {


        static Scanner scan = new Scanner(System.in);
        static int urunKodu;
        static int urunAdedi;
        static boolean ekUrun = false;
        static double toplam;
        static String urunAdi;
        static int urunFiyat;
        static String sepet = "";
        static String urunUcret;
        public static void main(String[] args) {
          /*
        ====================PROJEMIZ===================================
     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 manav,
        2 sarkuteri,
        3 market
        secime gor ,
        4-urunleri listele ve
        5-fiyatlari gelsin
     *
     * Basrili Market alış-veriş programı.
        1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.
              No   Ürün    Fiyat
             ===== ======= ========
              1 Patates 10 TL ,
        2 Biber 14 TL ,
        3 Soğan 8 TL  ,
        4 Havuç 4 TL
        5 Elma 10 TL
        6 pastirma 900 TL
        7 tavuk 33 TL
        8 salam 79 TL
        9 kasar 130 TL
        10 ciger 150 TL
        11 çikolata 5 TL
        12 cay  56 TL
        13 seker 140 TL
        14 un 89 Tl
        15 ekmek 4 Tl
     *
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
     * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
     * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
     * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz
     */
            girisEkran();
            fisAyrinti();
          }
        public static void girisEkran() {
            System.out.println("^^^ SÜPERMARKET ^^^^");
            Scanner scan = new Scanner(System.in);
            System.out.println("-----> MENU <-----");
            System.out.println("Manav Reyonu için 1\nŞarküteri Reyonu için 2\n" +
                    "Market Reyonu için 3\nFiş için 4 \n Çıkış için 5 tuşlayınız");
            int secim = scan.nextInt();
            if (!(secim >= 1 && secim <= 5)) {
                System.out.println("geçerli seçim yapınız !!");
                girisEkran();
            } else
                switch (secim) {
                    case 1:
                        manavReyonu();
                        break;
                    case 2:
                        sarkuteriReyonu();
                        break;
                    case 3:
                        marketReyonu();
                        break;
                    case 4:
                        fis();
                        break;
                    case 5:
                        cikis();
                }
        }
        static void fis() {
            System.out.println("toplam ödeme tutarı : " + toplam);
            System.out.println("kaç tl vereceksiniz : ");
            String bakiye = scan.next();
            double bakiye1 = Double.parseDouble(bakiye);
            // int bakiye1=Integer.valueOf(bakiye);
            if (bakiye1 < toplam) {
                System.out.println("yetersiz bakiye");
            } else
                fisAyrinti();
            System.out.println("para üstü : " + (bakiye1 - toplam));
            cikis();
        }
        static void cikis() {
            System.out.println("YINE BEKLERIZ ..");
        }
        static void marketReyonu() {
            System.out.println("ürün kodunu giriniz\n11 çikolata 5 TL\n" +
                    "        12 cay  56 TL\n" +
                    "        13 seker 140 TL\n" +
                    "        14 un 89 Tl\n" +
                    "        15 ekmek 4 Tl");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 11 && urunKodu <= 15) {
                    System.out.println("kaç adet ürün alacaksınız :");
                    urunAdedi = scan.nextInt();
                    switch (urunKodu) {
                        case 11:
                            urunAdi = "çikolata";
                            urunFiyat = 5;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 12:
                            urunAdi = "çay";
                            urunFiyat = 56;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 13:
                            urunAdi = "şeker";
                            urunFiyat = 140;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 14:
                            urunAdi = "un";
                            urunFiyat = 89;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 15:
                            urunAdi = "ekmek";
                            urunFiyat = 4;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                    }
                    urunFiyat = urunFiyat * urunAdedi;
                    urunUcret = "" + urunFiyat;
                    toplam += urunFiyat;
                    System.out.println("toplam fiyat  :" + toplam);
                    sepet += urunAdi + ": " + urunUcret + "tl'dir\n";
                    System.out.println("ek ürün almak isterseniz ürün kodunu girin ana menu için 0 a basın");
                } else if (urunKodu == 0) {
                    girisEkran();
                }
            }
        }
        static void sarkuteriReyonu() {
            System.out.println("6 pastirma 900 TL\n" +
                    "        7 tavuk 33 TL\n" +
                    "        8 salam 79 TL\n" +
                    "        9 kasar 130 TL\n" +
                    "        10 ciger 150 TL");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 6 && urunKodu <= 10) {
                    System.out.println("kaç adet ürün alacaksınız :");
                    urunAdedi = scan.nextInt();
                    switch (urunKodu) {
                        case 6:
                            urunAdi = "pastirma";
                            urunFiyat = 900;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 7:
                            urunAdi = "tavuk";
                            urunFiyat = 33;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 8:
                            urunAdi = "salam";
                            urunFiyat = 79;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 9:
                            urunAdi = "kasar";
                            urunFiyat = 130;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 10:
                            urunAdi = "ciger";
                            urunFiyat = 150;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                    }
                    urunFiyat = urunFiyat * urunAdedi;
                    urunUcret = "" + urunFiyat;
                    toplam += urunFiyat;
                    System.out.println("toplam fiyat  :" + toplam);
                    sepet += urunAdi + ": " + urunUcret + "tl'dir\n";
                    System.out.println("ek ürün almak isterseniz ürün kodunu girin ana menu için 0 a basın");
                } else if (urunKodu == 0) {
                    girisEkran();
                }
            }
        }
        static void manavReyonu() {
            System.out.println("1 Patates 10 TL ,\n" +
                    "        2 Biber 14 TL ,\n" +
                    "        3 Soğan 8 TL  ,\n" +
                    "        4 Havuç 4 TL\n" +
                    "        5 Elma 10 TL");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 1 && urunKodu <= 5) {
                    System.out.println("kaç adet ürün alacaksınız :");
                    urunAdedi = scan.nextInt();
                    switch (urunKodu) {
                        case 1:
                            urunAdi = "patates";
                            urunFiyat = 10;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 2:
                            urunAdi = "biber";
                            urunFiyat = 14;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 3:
                            urunAdi = "soğan";
                            urunFiyat = 8;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 4:
                            urunAdi = "havuç";
                            urunFiyat = 4;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                        case 5:
                            urunAdi = "elma";
                            urunFiyat = 8;
                            System.out.println(urunAdedi + " adet" + urunAdi + " : " + urunFiyat * urunAdedi);
                            break;
                    }
                    urunFiyat = urunFiyat * urunAdedi;
                    urunUcret = "" + urunFiyat;
                    toplam += urunFiyat;
                    System.out.println("toplam fiyat  :" + toplam);
                    sepet += urunAdi + ": " + urunUcret + "tl'dir\n";
                    System.out.println("ek ürün almak isterseniz ürün kodunu girin ana menu için 0 a basın");
                } else if (urunKodu == 0) {
                    girisEkran();
                }
            }
        }
        static void fisAyrinti() {
            System.out.print(sepet);
        }
    }


