package practice19temmuz;

public class C03 {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int toplam=0;
        int[][]number={{1,3,6},{2,8},{5,7,9,14}};
        System.out.println(cıftleriTopla(number));
        for (int[]each:number){
            for(int each2:each){
                if(each2%2==0){
                    toplam+=each2;

                }
            }
        }System.out.println("for each ile:"+toplam);

    }

    private static int cıftleriTopla(int[][] number) {
        int ciftTopla=0;
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j <number[i].length; j++)  {
                if(number[i][j]%2==0){
                    ciftTopla+=number[i][j];
                }

            }


        }return ciftTopla;
    }

}
