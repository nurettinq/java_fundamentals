package kendi_kendime_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class Manav {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {

        List<String>gunler=new ArrayList<String>();
        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carşamba");
        gunler.add("persembe");
        gunler.add("cuma");
        gunler.add("cumatesi");
        gunler.add("pazar");
        String[]gun=new String[7];
        for (int i = 0; i < gunler.size() ; i++) {
            gun[i] = gunler.get(i);

        }
        List<Integer> gunllukKazasnc = new ArrayList<Integer>();
       int i=0;
        while(i<7){
            Scanner scan=new Scanner(System.in);
            System.out.println(gunler.get(i)+"gunü kazancı giriniz");
            gunllukKazasnc.add(scan.nextInt());
            i++;
        }
        int ortalama=0;
        ortalama=getOrtalamaKazanc(gunllukKazasnc,ortalama);
        getOrtalamaUstundeKazancGünleri(gunllukKazasnc,ortalama,gunler);


    }

    private static void getOrtalamaUstundeKazancGünleri(List<Integer> gunllukKazasnc, int ortalama, List<String> gunler) {

        for (int i = 0; i <gunler.size(); i++) {
            if(gunllukKazasnc.get(i)>ortalama){
                System.out.println(gunler.get(i));

            }

        }

    }

    private static int getOrtalamaKazanc(List<Integer> gunllukKazasnc, int ortalama) {
        int toplam=0;
        for (int i = 0; i < gunllukKazasnc.size() ; i++) {
            toplam+=gunllukKazasnc.get(i);

        }ortalama=toplam/7;
        return ortalama;
    }

}
