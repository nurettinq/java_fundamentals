package day10_dtringmanipulation;

public class C01_CharAt {
    public static void main(String[] args) {
        String str="java ogrenmek ne guzel";
        System.out.println(str.toUpperCase().charAt(7));
        System.out.println(str.charAt(21));
        //Sring metotlarından birini kullanacaksak charAt()den önce kullanmamız gerekir
        System.out.println(str.toUpperCase());

    }
}
