package practice22temmuz;
import java.util.Arrays;
import java.util.Scanner;




public class ArrayS {
    public static void main(String[] args) {
        farkiniBul();

    }

    private static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz");
        int uzunluk=scan.nextInt();
        int[]arr=new int[uzunluk];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("array in"+(i+1)+". elemanını giriniz");
            arr[i]=scan.nextInt();


    } Arrays.sort(arr);
        System.out.println("en büyuk ile enn kucuk arasındaki fark  "+(arr[uzunluk-1]-arr[0]));
}}
