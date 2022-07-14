package day08_ifstatement;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        if (cinsiyet=='E') {
            if(yas<0||yas>100){
            System.out.println("lütfen geçerli bir  yaş giriniz");
        }else if(yas<65){
            System.out.println("emekli olamazsın");
        }else{
            System.out.println("emekliolabilirsiniz");
        }

        }else if (cinsiyet=='k'){
            if(yas<0||yas>100){
                System.out.println("lütfen geçerli bir  yaş giriniz");
            }else if(yas<60){
                System.out.println("emekli olamazsın");
            }else{
                System.out.println("emekliolabilirsiniz");
            }

        }else{
            System.out.println("lütfen geçerli bir tercih giriniz");
        }
    }
}
