package day07_ifstatement;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        if(yas>=65){
            System.out.println("emekli olabilirsiniz");

        } else{
            System.out.println("emekli olamazsın "+(65-yas)+"yıl daha çalışmalısın");
        }
    }
}
