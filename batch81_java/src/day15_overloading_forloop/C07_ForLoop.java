package day15_overloading_forloop;

import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int input= scan.nextInt();
        int faktoriyel= 1;
        if (input > 15 || input < 0) {
            System.out.println("faktoriyel hesaplanmaz");
        } else if (input== 0) {
            System.out.println(input+"!=1");

        } else {
            for (int i = 1; i <= input; i++) {
               faktoriyel*=i;


            }
            System.out.println(faktoriyel);
        }

    }
}