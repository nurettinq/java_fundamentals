package kendi_kendime;

import java.util.Scanner;

public class C01_Str_Length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("four-tre-to girniz");
        String str= scan.nextLine();
        int check=4;
        if (check==str.length()){
            System.out.println(str.charAt(check-1)+",");

        }else {
            System.out.println(str.charAt(0)+",");
        }
    }
}
