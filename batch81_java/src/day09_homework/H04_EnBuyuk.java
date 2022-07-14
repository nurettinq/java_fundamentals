package day09_homework;

import java.util.Scanner;

public class H04_EnBuyuk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç ssayı giriniz:");
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        double num3= scan.nextDouble();
        if (num1>num2){
            if (num1>num3) {
                System.out.println(num1+" is the biggest number");


            }else{
                System.out.println(num3+" is the biggest number");
            }

        }else if (num2>num3) {
            if (num2>num1) {
                System.out.println(num2+" is the biggest number");
            }else{
                System.out.println(num1+" is the biggest number");
            }
        }else if (num1>num3) {
            if (num1>num2) {
                System.out.println(num1+" is the biggest number");

            }else{
                System.out.println(num2+" is the biggest number");
            }
        }else if(num1==num2){
            if(num1>num3){
                System.out.println("num1 ve num2 are equal to each other and they are  the biggest numbers");
            }else

            System.out.println(num3+" is the biggest number");
        }else if(num1==num3){
            if(num1>num3){
                System.out.println("num1 ve num3 are equal to each other and they are  the biggest numbers");
            }else

                System.out.println(num2+" is the biggest number");

        }else if(num2==num3){
            if(num1>num3){
                System.out.println("num3 ve num2 are equal to each other and they are  the biggest numbers");
            }else

                System.out.println(num1+" is the biggest number");
        }else{
            System.out.println("all number are equal to each other");
        }

    }
}
