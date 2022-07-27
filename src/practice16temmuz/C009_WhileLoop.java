package practice16temmuz;

import java.util.Scanner;

public class C009_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int num=scan.nextInt();
        int coount=0;
        while(num>0) {
            if(num%2==1){
                System.out.println(num);
                coount++;
            }num--;
        }
        System.out.println("count :"+coount);
    }
}
