package day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
          // verilen iki sayıyı çarpıp
        // sonucu bize döndüren bir method yazın
        int sayi1=10;
        int sayi2=20;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("illa da sonucu göreyim : " + sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        int result=sayi1*sayi2;
        return result;
    }
}
