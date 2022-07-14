package kendi_kendime;

import java.util.Locale;

public class C04_StringManipulation {
    public static void main(String[] args) {
        String sentence="deha icin intihap yoktur. Deha icin intihap yoktur";
        String word="deha";

        System.out.println("1-"+word.concat(sentence));
        System.out.println("2-"+word.concat("icin intihap YOKtur"));
        System.out.println("3-"+word.charAt(2));
        System.out.println("4-"+sentence.charAt(19));
        System.out.println("5-"+sentence.toUpperCase());
        System.out.println("6-"+word.toUpperCase().charAt(1));
        System.out.println("7-"+sentence.toUpperCase(Locale.forLanguageTag("En")));
        System.out.println("8-"+word.equals("deha"));
        System.out.println("9-"+sentence.equals("deha"));
        System.out.println("10-"+word.equalsIgnoreCase("DEHA"));
        System.out.println("11-"+sentence.length());
        System.out.println("12-"+sentence.charAt(sentence.length()-1));
        System.out.println("13-"+sentence.indexOf("Deha"));
        System.out.println("14-"+word.indexOf("e"));
        System.out.println("15-"+word.indexOf("f"));
        System.out.println("16-"+sentence.indexOf('z'));
        System.out.println("17-"+sentence.indexOf("ha",2+1));
        System.out.println("18-"+sentence.lastIndexOf("tur",47-1));
        System.out.println("19-"+sentence.lastIndexOf('h',10));
        System.out.println("20-"+sentence.contains(word));
        System.out.println("21-"+word.contains("h"));
        System.out.println("22-"+sentence.contains("DEha"));
        System.out.println("23-"+sentence.endsWith("yoktur"));
        System.out.println("24-"+sentence.startsWith("deh"));
        System.out.println("25-"+word.startsWith("d"));


    }
}
