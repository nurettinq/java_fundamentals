package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /* sayı1 ve sdayı2 variable^ların değerini birbiri ile değiştiren bir program yazınız*/
        int sayi1 = 20;
        int sayi2 = 10;
        int sayi3 = 0;
        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;
        System.out.println("swaptan sonra sayi1:" + sayi1);
        System.out.println("swaptan sonra sayi2:" + sayi2);


    }
}
