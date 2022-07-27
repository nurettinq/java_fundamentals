package day10_dtringmanipulation;

public class C03_Equals {
    public static void main(String[] args) {
        String str1="Nurettin Guzel";
        String str2="Nurettin GUZEL";
        String str3="Nurettin Guzel"+"";
        String str4="Nurettin Guzel";
        String str5= new String("Nurettin Guzel");


        // String lerde aynı string olsa bile == her zaman çalışmaz
        // emin olmak isterseniz equals() kullanmalısınız..

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));
        System.out.println(str2==str4);
        System.out.println(str2.equals(str4));

    }
}
