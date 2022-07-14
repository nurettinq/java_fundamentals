package kendi_kendime;

public class C12_ForLoop {
    //bir strin içerisinde yinelenen karakterleri döndüren bir kod yazınız
    public static void main(String[] args) {
        String str = "javasenmibüyüksünbeni";


        System.out.println(yinelenenDondur(str));

    }

    public static String yinelenenDondur(String str) {

        String harf = "";
        String tekrarEden="";

        for (int i = 0; i < str.length() - 1; i++) {
            harf = str.substring(i, i + 1);
            int tekrar = str.indexOf(harf);
            int stekrar = str.lastIndexOf(harf);
            if (tekrar != stekrar) {
                if(!tekrarEden.contains(harf)){

                 tekrarEden+=harf;
            }


        }

    }
        return harf;
    }}

