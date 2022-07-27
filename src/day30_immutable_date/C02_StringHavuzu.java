package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str="Ali Can";
        String str2=str+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str.concat(hiclik);
        System.out.println(str==str2);
        System.out.println(str.equals(str2));

        System.out.println(str.equals(str3));
        System.out.println(str==str3);

        System.out.println(str2.equals(str4));
        System.out.println(str2==str4);
        String str5="Ali Can";
        String str6=str;
        System.out.println(str.equals(str5));
        System.out.println(str==str5);
        System.out.println(str.equals(str6));
        System.out.println(str==str6);

    }
}
