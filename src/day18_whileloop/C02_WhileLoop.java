package day18_whileloop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        Scanner scsan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scsan.nextInt();
        int rakamlartoplami=0;
        int birlerBasamak=0;
        while(sayi>0){
            birlerBasamak=sayi%10;
            rakamlartoplami+=birlerBasamak;
            sayi/=10;



        }
        System.out.println("rakamlar tolamı :"+rakamlartoplami);
    }
}
