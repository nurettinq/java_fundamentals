package day07_ifstatement;

import java.util.Scanner;

public class C07_IfElseif {
    //bir önceki soruda kullanıcı negatif deger girerse uyaralım
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        if(yas<0) {
            System.out.println("lütfen geçerli bir sayı giriniz");
        }
        else if(yas>=65){
            System.out.println("emekli olabilirsiniz");

        } else{
            System.out.println("emekli olamazsın "+(65-yas)+" yıl daha çalışmalısın");
        }
    }
}
