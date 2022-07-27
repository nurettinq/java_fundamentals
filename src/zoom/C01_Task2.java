package zoom;

public class C01_Task2 {
    public static void main(String[] args) {
        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan while code blogu create ediniz.
    */
        double yukseklik=45;
        double toplamyol=45;
        int sayacTop=0;
        while(yukseklik>=1){


            toplamyol+=2*yukseklik*3/4;
            yukseklik=yukseklik*3/4;

            sayacTop++;

        }
        System.out.println("top = " + sayacTop+ " defa  yerde sekti");
        System.out.println("toplamyol = " + toplamyol);

    }
}
