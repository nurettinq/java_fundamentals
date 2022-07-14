package kendi_kendime_2;

public class C01_Etka_2 {
    public static void main(String[] args) {
        String word="hello";
        sonIkiBasaGetir(word);
        System.out.println(sonIkiBasaGetir(word));
    }

    private static String sonIkiBasaGetir(String word) {
        String sonIki=word.substring(word.length()-2)+word.substring(0,word.length()-2);
        return sonIki;
    }
}
