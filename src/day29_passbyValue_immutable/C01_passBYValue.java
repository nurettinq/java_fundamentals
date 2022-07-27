package day29_passbyValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_passBYValue {
    public static void main(String[] args) {
        //4 elemanlı bir array oluşturslım
        // sonra ayrı bir metodda bu array in 2. ve4. elemanlarını
        // 100 den kucuk rastgele bir sayi ile degiştirelim ve
        // yeni halini dondurelim
        int [] arr={5,7,3,8,};
        elemaanDegistir(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] elemaanDegistir(int[] arr) {
        Random rand = new Random();
        arr[1]=rand.nextInt(100);
        arr[3]=rand.nextInt(100);
        return arr;
    }
}
