package day22_MDAandList;

public class C03_MultiDimen {
    public static void main(String[] args) {

   int [][] sayilar={{1,2,3,4},{34,5},{3,456,4,}};

    toplaGetirr(sayilar);
}

    private static void toplaGetirr(int[][] sayilar) {
        int istenenToplam=0;
        for (int i = 0; i <sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length; j++) {

                if(i==j){
                  istenenToplam+= sayilar[i][j];


                }
            }

            
        } System.out.println(istenenToplam);
    }
    }
