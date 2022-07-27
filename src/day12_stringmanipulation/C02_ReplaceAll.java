package day12_stringmanipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok guz/el";

                // ReplaceAll() deki all ın amacı tüm karakterleri kapsamasıdır
        str=str.replaceAll(" ","qwq");

        str=str.replaceAll("\\d","");
        str=str.replaceAll("\\W","");
        System.out.println(str.replaceAll("qwq"," "));

}
}