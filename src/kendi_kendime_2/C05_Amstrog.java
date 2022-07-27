package kendi_kendime_2;


public class C05_Amstrog {
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


        int b1,b2,c1,c2,c3,d1,d2,d3,d4,e1,e2,e3,e4,e5;
        for (int i = 1; i <99999 ; i++) {
            if(i<10){
                System.out.println(i +"   amstrong sayidir");


        }else if(i<100){
                b1=i%10;
                b2=i/10%10;
                if(i==b1*b1+b2*b2){
                    System.out.println(i+"  amstrong sayidir");
                }
            }else if(i<1000){
                    c1=i%10;
            c2=(i/10)%10;
            c3=i/100%10;
            if(i==c1*c1*c1+c2*c2*c2+c3*c3*c3){
                System.out.println(i +"  amstrong sayidir");
            }

        }else if(i<10000){
                d1=i%10;
                d2=(i/10)%10;
                d3=(i/100)%10;
                d4=i/1000%10;
                if(i==d1*d1*d1*d1+d2*d2*d2*d2+d3*d3*d3*d3+d4*d4*d4*d4){
                    System.out.println(i +"  amstrong sayidir");
                }
            }else{
                e1=i%10;
                e2=i/10%10;
                e3=i/100%10;
                e4=i/1000%10;
                e5=i/10000%10;
                if(i==e1*e1*e1*e1*e1+e2*e2*e2*e2*e2+e3*e3*e3*e3*e3+e4*e4*e4*e4*e4+e5*e5*e5*e5*e5){
                    System.out.println(i +"  amstrong sayidir");
                }
            }
            }
        for (int i = 5; i>1 ; i--) {
            for (int j = (int)Math.pow(10,i)-1; j >=(int)Math.pow(10,i-1) ; j--) {
                int sonuc=0;
                for (int k = j; k >0 ; k/=10) {
                    sonuc+=Math.pow(k%10,i);

                }if(sonuc==j){
                    System.out.println(j+" armstrong sayidir");

                }

            }

        }
        System.out.println("1 armstrong sayidir");
*/
        for (int i = 5; i >1 ; i--) {
            for (int j =(int) Math.pow(10,i)-1; j >=(int)Math.pow(10,i-1) ; j--) {
                int sonuc=0;
                for (int k =j; k >0 ; k/=10) {
                    sonuc+=(int)Math.pow(k%10,i);

                }if(sonuc==j){
                    System.out.println(j+" armstrong bir sayidir");
                }

            }

        }
        System.out.println("1 armstrong bir sayidir");
    }
}
