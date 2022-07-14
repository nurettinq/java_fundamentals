package day08_ifstatement;

import java.util.Scanner;

public class C02_IfELseIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double point=scan.nextDouble();



        if ((point<0)||(point>100)){
            System.out.println("lütfen geçerli bir not giriniz");
        }
        else if (point<50) {
            System.out.println("D");
        }
        else if (point<60){
            System.out.println("E");

        }
        else if (point<80){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
    }
}
