package day06_wrapperconca;

public class C02_Concatination {
    public static void main(String[] args) {
        String str="Java";
        String str2="Güzeldir";
        int sayi=5;
        int sayi2=4;
        System.out.println(str+" "+str2+" "+sayi+sayi2);

        System.out.println(str+" "+str2+(sayi+sayi2));
        System.out.println(""+sayi+sayi2+str+" "+str2);
        System.out.println(sayi+sayi2+" "+str);
        System.out.println(str.concat(str2));
        System.out.println(str.concat(" ").concat(str2));

    }
}
