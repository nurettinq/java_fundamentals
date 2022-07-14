package day21_arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        int [] sayilar={2,35,565,34,5,6,3,};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,2));
        System.out.println(Arrays.binarySearch(sayilar,5));
        System.out.println(Arrays.binarySearch(sayilar,54));
        System.out.println(Arrays.binarySearch(sayilar,-152));

    }
}
