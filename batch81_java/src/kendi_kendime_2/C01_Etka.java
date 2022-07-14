package kendi_kendime_2;

public class C01_Etka {
    public static void main(String[] args) {
        String word="woohoo";
        System.out.println(firsthalf(word));
    }

    public static String firsthalf(String word) {
       word=word.substring(0,word.length()/2);
        return word;

    }

}
