package day21_arrays;

import java.util.Arrays;

public class C06_ArrayELemanEkle {
    public static void main(String[] args) {
        // C05 deki metodu kulllanarak arraya eleman ekleyin
        String[] takimList={"emin","erdal","nuri","ömer"};
        String eklenecekAdam="talha";
        takimList=C05_ArrayEkle.elemanEkle(takimList,eklenecekAdam);
        System.out.println(Arrays.toString(takimList));
    }

}
