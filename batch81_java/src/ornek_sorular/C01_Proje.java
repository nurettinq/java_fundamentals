package ornek_sorular;

import java.util.Scanner;

public class C01_Proje {
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
		00 Domates 2.10 TL ,
		01 Patates 3.20 TL ,
		02 Biber 1.50 TL ,
		03 Soğan 2.30 TL  ,
		04 Havuç 3.10 TL
		05 Elma 1.20 TL
		06 Muz 1.90 TL
		07 Çilek 6.10 TL
		08 Kavun 4.30 TL
		09 Üzüm 2.70 TL
		10 Limon 0.50 TL
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
        Scanner scan=new Scanner(System.in);
        System.out.println("====================SHOP===================================\n" +
                "\t * AVM YE HOŞGELDİNİZ   \n" +
                "\t\t1 manav,\n" +
                "\t\t2 sarkuteri,\n" +
                "\t\t3 market\nlütfen alışveriş tercihinizi yapınız");

        boolean secimMi=false;
        while (!secimMi) {
            int input=scan.nextInt();
        if (!(input==1||input==2||input==3)){
            System.out.println("lütfen doğru tercih yapınız");


        }else {

                switch (input) {
                    case 1:
                        manav();
                        break;
                    case 2:
                        sarkuteri();
                        break;
                    case 3:
                        market();
                        break;
                }
            secimMi=true;
            }

        }

    }

    public static void market() {
        Scanner mar = new Scanner(System.in);
        System.out.println("istediğiniz ürünün kodunu giriniz");
        int marketUrunKod;
       int urunAdedi;
        double toplamFiyat = 0;

        String urunadi;
        double urunFiyati = 0;
        boolean ekUrun = false;
        while (!ekUrun) {

            marketUrunKod = mar.nextInt();

       if(marketUrunKod==0){

                ekUrun = true;

            }



            else if (marketUrunKod > 0 && marketUrunKod < 11) {
           System.out.println("lütfen ürün adedini giriniz");
           urunAdedi = mar.nextInt();



                switch (marketUrunKod) {
                    case 1:
                        urunadi = "cikolata";
                        urunFiyati = 7.25;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 2:
                        urunadi = "gofret";
                        urunFiyati = 8.24;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 3:
                        urunadi = "sut";
                        urunFiyati = 7.5;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 4:
                        urunadi = "peynir";
                        urunFiyati = 7.025;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 5:
                        urunadi = "deterjan";
                        urunFiyati = 7.225;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 6:
                        urunadi = "reçel";
                        urunFiyati = 85.5;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 7:
                        urunadi = "cay";
                        urunFiyati = 17.25;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 8:
                        urunadi = "pirinc";
                        urunFiyati = 71.25;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 9:
                        urunadi = "meyvesuyu";
                        urunFiyati = 7.225;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;
                    case 10:
                        urunadi = "su";
                        urunFiyati = 7.295;
                        System.out.println(urunAdedi+" adet "+urunadi + ":" + urunFiyati * urunAdedi);
                        break;


                }

                urunFiyati = urunFiyati * urunAdedi;
                toplamFiyat += urunFiyati;

                System.out.println("toplamFiyat:" + toplamFiyat);
           System.out.println("ek şarküteri ürünü almak isterseniz kodunu giriniz istemiyorsanız '0' basın");




       }else{
                System.out.println("lütfen doğru tercih yyapınız");
            }

        }
    }
    public static void sarkuteri() {
        Scanner mar = new Scanner(System.in);

        System.out.println("istediğiniz şarküteri ürünün kodunu giriniz");
        int sarkutUrunKod;
        int urunkilo;
        double toplamFiyat = 0;

        String urunadi;
        double urunFiyati = 0;
        boolean ekUrun = false;
        while (!ekUrun) {


            sarkutUrunKod = mar.nextInt();

            if(sarkutUrunKod==0){

                ekUrun = true;

            }



            else if (sarkutUrunKod > 0 && sarkutUrunKod < 11) {
                System.out.println("lütfen ürün kilosunu giriniz");
                urunkilo = mar.nextInt();



                switch (sarkutUrunKod) {
                    case 1:
                        urunadi = "pastırma";
                        urunFiyati = 900;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 2:
                        urunadi = "kaşar";
                        urunFiyati = 45;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 3:
                        urunadi = "sucuk";
                        urunFiyati = 85;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 4:
                        urunadi = "peynir";
                        urunFiyati = 100;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 5:
                        urunadi = "yumurta";
                        urunFiyati = 45;
                        System.out.println(urunkilo+" Koli "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 6:
                        urunadi = "sut";
                        urunFiyati = 15;
                        System.out.println(urunkilo+" litre "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 7:
                        urunadi = "tavuk but";
                        urunFiyati = 55;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 8:
                        urunadi = "ciger";
                        urunFiyati = 71.25;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 9:
                        urunadi = "pirzola";
                        urunFiyati = 90;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 10:
                        urunadi = "antrikot";
                        urunFiyati = 75;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;


                }

                urunFiyati = urunFiyati * urunkilo;
                toplamFiyat += urunFiyati;
                System.out.println("toplamFiyat:" + toplamFiyat);
                System.out.println("ek şarküteri ürünü almak isterseniz kodunu giriniz istemiyorsanız '0' basın");



            }else{
                System.out.println("lütfen doğru tercih yyapınız");
            }

        }

    }

    public static void manav() {
        Scanner mar = new Scanner(System.in);
        System.out.println("istediğiniz manav ürünün kodunu giriniz");
        int urunKod;
        int urunkilo;
        double toplamFiyat = 0;

        String urunadi;
        double urunFiyati = 0;
        boolean ekUrun = false;
        while (!ekUrun) {


            urunKod = mar.nextInt();

            if(urunKod==0){

                ekUrun = true;

            }



            else if (urunKod > 0 && urunKod < 11) {
                System.out.println("lütfen ürün kilosunu giriniz");
                urunkilo = mar.nextInt();



                switch (urunKod) {
                    case 1:
                        urunadi = "uzum";
                        urunFiyati = 45;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 2:
                        urunadi = "kavun";
                        urunFiyati = 10.56;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 3:
                        urunadi = "çilek";
                        urunFiyati = 48.12;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 4:
                        urunadi = "muz";
                        urunFiyati = 100;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 5:
                        urunadi = "elma";
                        urunFiyati = 45.25;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 6:
                        urunadi = "havuc";
                        urunFiyati = 15;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 7:
                        urunadi = "soğan";
                        urunFiyati = 5;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 8:
                        urunadi = "biber";
                        urunFiyati = 25;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 9:
                        urunadi = "patates";
                        urunFiyati = 8;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;
                    case 10:
                        urunadi = "domates";
                        urunFiyati = 75;
                        System.out.println(urunkilo+" kilo "+urunadi + ":" + urunFiyati * urunkilo);
                        break;


                }

                urunFiyati = urunFiyati * urunkilo;
                toplamFiyat += urunFiyati;
                System.out.println("toplamFiyat:" + toplamFiyat);
                System.out.println("ek manav ürünü almak isterseniz kodunu giriniz istemiyorsanız '0' basın");



            }else{
                System.out.println("lütfen doğru tercih yyapınız");
            }

        }

    }
}
