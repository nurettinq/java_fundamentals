package day10_dtringmanipulation;

import java.util.Locale;

public class C02_ToLowerCase {

    public static void main(String[] args) {
        String str="beni psikopata bağlamayın";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("EN")));


    }
}
