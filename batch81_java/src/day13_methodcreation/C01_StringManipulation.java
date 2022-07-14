package day13_methodcreation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replaceAll("\\D","");
        double sayi=Double.parseDouble(str1);
        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);
        System.out.println("$"+(sayi+sayi2)/100);

    }
}
