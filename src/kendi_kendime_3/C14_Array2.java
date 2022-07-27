package kendi_kendime_3;

import java.util.ArrayList;
import java.util.List;

public class C14_Array2 {
    public static void main(String[] args) {
        // verilen bir arraydeki unique elemanları yeni bir array olark donduren bir metod yazınız
        String[] array = {"nur","nuri","nurettin","nurullah","nurten","nur","nuri"};
        uniquegetir(array);
    }

    private static void uniquegetir(String[] array) {
        List<String> unique = new ArrayList<String>();
        for (int i = 0; i < array.length ; i++) {;
            for (int j = i; j < array.length ; j++) {
                if(array[j].equals(array[i])) {
                    unique.add(array[i]);

                }

            }

        }
        System.out.println(unique);
    }
}
