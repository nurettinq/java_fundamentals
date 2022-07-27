package day12_stringmanipulation;

public class C03_SubString {
    public static void main(String[] args) {
        String isim="nurettin";
        String soyisim="guzel";
        String kartNo="1234 2548 2547 4555";
        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));
        System.out.println(isim.substring(2,4));      // 2 dahil 4 dahil değil
        String ilkHarf=isim.substring(0,1).toUpperCase();
        String isimGerisi=isim.substring(1).replaceAll("\\w","*");
        String soyİlk=soyisim.substring(0,1).toUpperCase();
        String soyGerisi=soyisim.substring(1).replaceAll("\\w","*");;
        String kartİlkDort=kartNo.substring(0,4);
        String kartGerisi=" **** **** ****";
        System.out.println(ilkHarf+isimGerisi+" "+soyİlk+soyGerisi+"\n"+kartİlkDort+kartGerisi);


    }
}
