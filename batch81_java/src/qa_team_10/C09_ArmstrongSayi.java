package qa_team_10;

public class C09_ArmstrongSayi {
    public static void main(String[] args) {
        /* ARMSTRONG SAYI:
        Bir sayının; ayrı ayrı her bir basamağının, o sayının basamak adeti kadar üssü alınarak toplanır.
                Eğer bu toplam sonucu o sayıya eşit ise; sayı Armstrong Sayıdır.
                Örnek1;  153 Sayısı. 3 basamaklıdır. Her bir basamağının küplerinin ( 3 basamaklı olduğu için ) toplamı
        kendine eşit olduğu için ARMSTRONG sayıdır.
        (1*1*1) + (5*5*5) + (3*3*3)  ===> 1 + 125 + 27 = 153
        Örnek2: 1634 sayısı. 4 basamaklıdır. Her bir basamağının ayrı ayrı 4.kuvvetlerinin toplamı kendine eşittir.
        1634 = (1*1*1*1) + (6*6*6*6)+ (3*3*3*3) + (4*4*4*4) ==> 1634 eder.

                Soru : 1 ile 99.999 sayıları dahil;  bu aralıkta olan sayılardan Armstrong sayiları yazdıran bir java kodu yazın.


         */
        for (int i = 5; i >1 ; i--) {
            for (int j =(int) Math.pow(10,i)-1; j >=(int)Math.pow(10,i-1);j--){
                int sonuc=0;
                for (int k = j; k >0 ; k/=10) {
                    sonuc+=(int)Math.pow(k%10,i);

                }if(sonuc==j){
                    System.out.println(j+ " armstrong bir sayidir");
                }
            }

        }
        System.out.println("1 armstrong sayidir");

    }

}
