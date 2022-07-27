package day14_methodcreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
          //input olarak verilen isim ve soyisimi ilk harfi büyük geeriye kalan harfler yıldız olacak şekilde
        // yazdıran bir method oluşturun
        String isim="nurettin";
        String soy="güzzel";
        ismiGizle(isim,soy);
        C01_Methodcreation.tersteYazdır("mane");
       C02_MethodCreation.rakamlariTopla(452);
    }

    public static void ismiGizle(String isim, String soy) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soy=soy.substring(0,1).toUpperCase()+soy.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soy);

    }
}
