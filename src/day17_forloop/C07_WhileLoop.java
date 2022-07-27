package day17_forloop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20den 50 ye kadar çift sayıları yazdıralım sınırlaar dahil
        int bas = 20;
        int bit = 50;


        for (int i = bas; i <= bit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int temp = bas;
        while (temp <= bit) {
            if (temp % 2 == 0) {

                System.out.println(temp+"");
                temp++;
            }
            System.out.println("");
        }

    }
}