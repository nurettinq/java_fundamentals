package day05_matematiksel;

public class C01_PrePost {
    public static void main(String[] args) {
        int sayi1=10;
        int num1=10;
        int sayi2=sayi1++;    //önce artırma sonra atama


        int sayi3=++num1;    //vvönce atama sonra artırma
        System.out.println("sayi2:"+sayi2);
        System.out.println("sayi3:"+sayi3);
    }
}
