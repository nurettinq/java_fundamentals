package day28_staticBlock;

public class StaticBlock {
    /* static blocklar class uyelerinin hepsinden once calısır/main metottan bile once
    static variable lara deger ataması icin kullanılabilir
     */

    static int sayi;
    static{
        System.out.println("static block çalisti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main metot calisti");
        System.out.println(sayi);
    }
    static {

        System.out.println(sayi);
    }
}
