package day06_free;

import java.util.Scanner;

public class C04_NumberEqual {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört tamsayı gireiniz:");
      int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int num4=scan.nextInt();
        if(num1==num2&&num2==num3&&num3==num4)
            System.out.println("numbers are equal");
        else
            System.out.println("numbers aren't equal");




    }
}
