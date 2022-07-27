package kendi_kendime_3;

public class C18_Array {
    public static void main(String[] args) {
        /* Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.


    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
    */
    int[]sayi={456,4,67,4,7,78,96,}    ;
        System.out.println("enbüyük sayi ile en küçük sayi farkı:"+sayiFarki(sayi));
          }

    private static int sayiFarki(int[] sayi) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        int enk=0;
        int enb=0;

        for (int i = 0; i <sayi.length; i++) {
            if(sayi[i]>a){
            enb=sayi[i];
            a=enb;

            }

            }
        for (int i = 0; i <sayi.length; i++) {
            if(sayi[i]<b){
                enk=sayi[i];
                b=enk;

        }


        }

        return enb-enk;
    }
}
