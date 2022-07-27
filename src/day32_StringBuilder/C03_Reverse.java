package day32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {


    //verilen bir inputu tersine cervirip bize donduren bir metod olusturun
    String input="hey gidi loop günleri";
    String tersInput=tersineCevir(input);
        System.out.println(tersInput);
    }
    public static String tersineCevir(String input) {
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();
    }

}
