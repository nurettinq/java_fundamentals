package kendi_kendime_2;

public class C01_ForLoop {
    public static void main(String[] args) {
        int sayi=4;
        for (int i = 0; i <sayi ; i++) {
            for (int spc=sayi-i; spc >0 ; spc--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }

    }
}
