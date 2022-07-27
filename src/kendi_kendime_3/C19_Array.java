package kendi_kendime_3;

import java.util.Arrays;

public class C19_Array {
    public static void main(String[] args) {
        /*Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
    Örnek:

    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.*/
        int[]sayi={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegative(sayi)));
    }
    private static int[] countPositivesSumNegative(int[] sayi) {
        int [] countPsumN=new int[2];
        for (int i = 0; i < sayi.length ; i++) {

      if(sayi[i]<0){
          countPsumN[1]+=sayi[i];
      }else {
          countPsumN[0]++;
      }

        }
        return countPsumN;

    }
}
