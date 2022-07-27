package kendi_kendime;


public class C20_Frekans {
    public static void main(String[] args) {

        String mesaj = "AAABBCDD";
        frekans(mesaj);
    }
    private static void frekans(String mesaj) {
        int adet = 1;                                             // aranan harfin başlangıç değeri 1 olarak kabul edildi.
        String arananHarf = "" + mesaj.charAt(0);               //   arananHarf değişkenine ilk harf, örneğe göre=A atanarak döngü başlatıldı.
        for (int i = 1; i < mesaj.length(); i++) {
            if (mesaj.substring((i)).contains(arananHarf)) {     // mesajın i.indeksinden sonrasındaki tüm karakterlerde aranaHarf varmı diye soruldu
                adet++;                                           // var ise adet 1 artırıldı
            } else {
                System.out.print(arananHarf + (adet));      // yok ise arananHarf ve adeti yan yana yazdırıldı. ==> A3
                arananHarf = "" + mesaj.charAt(i);         // yeni aranacak olan harf, ( örneğe göre B harfi ) aranaHarf değişkenine aktarıldı
                adet = 1;                                  // adet değeri resetlenerek 1 yapıldı.
            }
        }
        System.out.print(arananHarf + (adet));            // son harfin adedti aranırken döngü bittiğinden, döngü içinde yazdırılamayan
        //  son harf ve adeti ( örnekte D2) en son olarak ekrana yazdırıldı.
    }
}


