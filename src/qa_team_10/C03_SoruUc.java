package qa_team_10;

import java.util.Scanner;

public class C03_SoruUc {
    public static void main(String[] args) {
        // kullanıcıya yaşını sorun , eğer yaş 65'ten küçükse "emekli olamazsın çalişmalisin"
        // 65'e eşit veya büyükse "emekli olabilirsiniz"
        // kullanıcının 0 dan küçük veya 100 den büyük birb sayı girdiğinde uyarı verelim
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        if (yas<0||yas>100){
            System.out.println("lütfen gerçek yaşınızı giriniz");

        }else if(yas>=65){
            System.out.println("emekli olabilirsiniz");
        }else{
            System.out.println("emekli olamazsınız");
        }
    }
}
