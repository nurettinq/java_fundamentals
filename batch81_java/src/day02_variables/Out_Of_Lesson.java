package day02_variables;

import java.util.Scanner;

public class Out_Of_Lesson {
    public static void main(String[] args) {
        System.out.println("bir sayı giriniz");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        Scanner num=new Scanner(System.in);
        int num2=num.nextInt();
        for (int i=5;i>1;i--){
            num1=i*i;
            System.out.println(num1);
        }
    }
}
