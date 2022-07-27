package day21_arrays;


import java.util.Arrays;

public class C080_BinarySearch {
    public static void main(String[] args) {
        // binary searc java da eleman armaanın kısa yoludur
        // ancak binary search çalışması  için arrayi sıralamanız gerekmektedir
        // eğer sıralama yapmazsanız yanlış sonuç bulabilirsiniz
        String[] harfler={"Y","B","D","F","H"};
        String arananHarf="B";
        System.out.println(C03_ContainsMetod.contains(harfler, arananHarf));
        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler, arananHarf));

    }
}
