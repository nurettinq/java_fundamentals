package day11_stringmanipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str=scan.nextLine();



        if((str.contains("buyuk") &&str.contains("kucuk"))) {
            System.out.println("kara ver buyuk mu kucuk mu");
        }
           else if(!(str.contains("buyuk")&&str.contains("kucuk"))){
                System.out.println("cumle buyuk yada kucuk kaleimesi içermiyor");
        }else if (str.contains("buyuk")){
            System.out.println(str.toUpperCase());
        }else if (str.contains("kucuk")){
            System.out.println(str.toLowerCase());
        }
    }
}
