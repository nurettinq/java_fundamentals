package qa_team_10;

import java.util.Scanner;

public class C02_SoruIki {
    public static void main(String[] args) {
        // kullanıcıdan bir karakter girmesini isteyin ve harf olup olmadıgını yazdırınız
        // eğer kullanıcı birden fazla karakter girmiş ise uyarı mesajı gönderin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz :");
        String harf=scan.next();
        if (harf.length()>1){
            System.out.println("lütfen tek karakter giriniz");
        }else if((harf.charAt(0)>='A'&&harf.charAt(0)<='Z')||(harf.charAt(0)>='a'&&harf.charAt(0)<='z')){
            System.out.println("girdiginiz karakter bir harftir");

        }else{
            System.out.println("girdiginiz karakter bir harf değildir");
        }
    }
}
