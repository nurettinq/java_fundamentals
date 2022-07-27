package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // kullanıcıdan bir harf isteyin
        //kuçük harf ise küçük harf
        // büyük harf ise büyük harf
        // yoksa "girdiğiniz karakter harf değil
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        String sonuc=harf>='a'&&harf<='z'?"küçük harf":harf>='A'&&harf<='Z'?"büyük harf":"geçersiz karakter";
        System.out.println(sonuc);

    }
}
