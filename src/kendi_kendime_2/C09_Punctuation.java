package kendi_kendime_2;

public class C09_Punctuation {
    public static void main(String[] args) {
       // Find the total number of characters different from space and punctuation marks in a String

        String sentence="fgjş..,fdsd dsfg lkdf";
        sentence.replaceAll("\\s","").replaceAll("\\p{Punct}","");
        System.out.println(sentence.length());
    }
}
