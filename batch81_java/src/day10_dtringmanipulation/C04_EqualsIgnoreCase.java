package day10_dtringmanipulation;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Nurettin Guzel";
        String str2 = "nurettin guzel";
        String str3 = "NURETTİN GUZEL";
        String str4 = "Nurettin Guzel_";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));



    }
}
