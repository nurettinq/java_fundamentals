package kendi_kendime;

import java.util.Scanner;

public class C17_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayıi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        int sayac=0;

        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                System.out.print(i+",");
                toplam+=i;
                sayac++;
            }

        }System.out.println("toplam: "+toplam +"\n sayac:"+sayac);

    }
}
