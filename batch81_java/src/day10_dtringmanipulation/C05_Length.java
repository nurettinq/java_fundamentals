package day10_dtringmanipulation;

public class C05_Length {
    public static void main(String[] args) {
        String str="java öğren, isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));
        String str2="";     // deger atanmış ve bu deger hiçliktir
        System.out.println(str2.length());
        String str3=null;     //str3 e bir deger atanmamış. null bir deger atanmadığını belirtir
        System.out.println(str3.length());  // bir değer atanmamışki nasıl uzunlugu olsun.
                                            // NullExceptionPointer olarak hata verir.



    }
}
