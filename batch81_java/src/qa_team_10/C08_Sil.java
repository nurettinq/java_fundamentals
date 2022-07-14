package qa_team_10;

import java.util.Scanner;

public class C08_Sil {
    // Bir string içinden girdiğimiz karakteri
    // silen bir java Method yazın
// String="kkmekrkkhabkak"" olsun. Silinecek karakter
// 'k' olsun. geri dönecek değer ==> "merhaba"
    public static void main(String[] args) {
        String word="";
        silin(word);
        System.out.println(word);


    }

    public static String silin(String word) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kelime giriniz");
        String word2=scan.nextLine();
        System.out.println("silinecek harfi giriniz");
        char harf=scan.next().charAt(0);
        String word3=harf+"";
        String box="";
        System.out.println(word3.replaceAll(word3,""));
        for (int i = 0; i <word2.length(); i++) {
            if (harf==word2.charAt(i)) {
                box+=harf;
            }else {
                word+=word2.charAt(i);
            }
        }

        System.out.println(word);
        return word;

    }
}
