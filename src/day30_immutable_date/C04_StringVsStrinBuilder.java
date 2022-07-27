package day30_immutable_date;

import java.time.LocalTime;

public class C04_StringVsStrinBuilder {
    public static void main(String[] args) {
        /* string mi StringBuilder mı hızlıdır;
        bunun için bir string oluşturup , 1000 kere sonuna nokta koyalım
        öncesinde ve sonrasında zamanı alıp farkı bulalım
        aynı işlemni StringBuişder ile de yapalım*/
        LocalTime baslangic=LocalTime.now();
        String str="ahh jaava";
        for (int i = 0; i <1000 ; i++) {
            str +=".";

        }
        LocalTime bitis=LocalTime.now();

       baslangic=LocalTime.now();
        String st="ahh jaava";
        for (int i = 0; i <1000 ; i++) {
            st+=".";

        }
       bitis=LocalTime.now();
    }
}
