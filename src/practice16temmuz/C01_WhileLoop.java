package practice16temmuz;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println(basmakTopla(num));

    }

    private static int basmakTopla(int num) {
    int toplam=0;
    while(num!=0){
        toplam+=num%10;
        num/=10;
    }

        return toplam;
    }
}
