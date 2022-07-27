package qa_team_10;

import java.util.Scanner;

public class C07_Fra {
    public static void main(String[] args) {
        String rota;
        int biletAdedi;
        double bakiye;
        double frankfurtTutar;
        double kolnTutar;
        double toplamTutar;
        double paraUstu;
        int kolnKm=80;
        int frankfurtKm=60;
        int birimFiyat20Km=5;
        Scanner scan=new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz?"+
                "\n (Frankfurt : 60 KM          ---         Köln : 80 KM ---"+
                "\n(20 KM başına 5 euro bilet parası alınmaktadir..)");
        rota=scan.next().toUpperCase();
        if (!(rota.equals("FRANKFURT")|| rota.equals("KOLN"))){
            System.out.println("lütfen rotanızı gözden geçirin");
        }else{
        System.out.println("kaç kişilik bilet istiyorsunuz? (max 2 kişlik): " );
        biletAdedi=scan.nextInt();
        if (biletAdedi<1||biletAdedi>2){
            System.out.println("lütfen bilet adedini gözden geçirin max 2 kişilik");
        }else{
                    System.out.println("bakiyeniz?");
        bakiye=scan.nextDouble();
        switch(rota){
            case "FRANKFURT":

                frankfurtTutar=frankfurtKm/20*birimFiyat20Km;
                toplamTutar=frankfurtTutar*biletAdedi;

                if(bakiye<toplamTutar){
                    System.out.println("bakiye yetersiz!!!");
                }else{
                   paraUstu=bakiye-toplamTutar;
                    System.out.println(rota+"a "+biletAdedi+"kişilik" +
                            "\n toplamtutar:"+toplamTutar+"" +
                            "\n bakiyeniz:"+bakiye+
                            "\n paraüstü: "+paraUstu);

                }
                break;

            case "KOLN":

                kolnTutar=kolnKm/20*birimFiyat20Km;
                toplamTutar=kolnTutar*biletAdedi;
                if(bakiye<toplamTutar){
                    System.out.println("bakiye yetersiz!!!");
                }else {
                    paraUstu = bakiye - toplamTutar;
                    System.out.println(rota + "a " + biletAdedi + "kişilik" +
                            "\n toplamtutar:" + toplamTutar + "" +
                            "\n bakiyeniz:" + bakiye +
                            "\n paraüstü: " + paraUstu);


                }
                break;




        }



    }}}
}
