package day39_exception;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        String []arr={"süt","çiko","gofret","peynir","yumurta","zeytin"};
        System.out.println("istediginiz urunun sıra nosunu giriniz");
        Scanner scan=new Scanner(System.in);
        try {

            int sira=scan.nextInt();
            try {
                String istenilenUrun=arr[sira];
                System.out.println(arr[sira]);
            } catch (Exception e) {
                System.out.println("girdiginiz sira urun sayisindan buyuk");
            }

        } catch (Exception e) {
            System.out.println("lütfen sira no giriniz");
        }
    }
}
