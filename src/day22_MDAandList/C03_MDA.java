package day22_MDAandList;

public class C03_MDA {
    public static void main(String[] args) {
        int [][] sayilar={{2,354,5,6},{3,4,65,2},{2,3}};
        int carpim=1;
        for (int i=0; i<sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length ; j++) {

                if(j== sayilar[i].length-1){
                    carpim*=sayilar[i][j];
                }

            }
        }System.out.println(carpim);

    }
}
