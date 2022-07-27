package kendi_kendime_3;

public class C08_Task_2 {
    public static void main(String[] args) {
        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
        double yukseklik=43;
        double toplamYol=43;
        int sayac=0;
                while(yukseklik>=1){

            toplamYol+=2*yukseklik*3/4;
            yukseklik=yukseklik*3/4;
            sayac++;
        }
        System.out.println("sayac = " + sayac);
        System.out.println("toplamYol = " + toplamYol);

    }
}
