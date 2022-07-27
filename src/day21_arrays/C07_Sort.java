package day21_arrays;

import java.sql.Array;
import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {
        // array i arrays metodunu kulllanarak sıralı hale gertirebiliriz
        int[] sayilar={2,3,5,56,67,4,3,6,};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
