package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi alın negatifse karesini al pozitifse "pozitif" yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double num=scan.nextDouble();
        // eğer ternary içindeki sonuçlar farklı data türlerinde ise atama yapamayız sadece okutabiliriz
        System.out.println(num>0?"sayi pozitif":(num*num));
        }
}
