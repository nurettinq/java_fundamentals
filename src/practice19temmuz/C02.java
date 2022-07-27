package practice19temmuz;

public class C02 {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String[][] fiyat={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        for (int i = 0; i < fiyat.length ; i++) {
            for (int j = 0; j <fiyat[i].length ; j++) {
                if(fiyat[i][j].contains("€")){
                   toplam+= Double.parseDouble(fiyat[i][j].replaceAll("€",""))*4.2;
                }
                else if(fiyat[i][j].contains("$")){
                    toplam+= Double.parseDouble(fiyat[i][j].replace("$",""))*3.2;
                }

            }

        }
        System.out.println("toplam = " + toplam);
    }
}
