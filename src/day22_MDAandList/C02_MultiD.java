package day22_MDAandList;

public class C02_MultiD {
    public static void main(String[] args) {
        int [][] sayilar={{1,2,3,4},{34,5},{3,456,4,}};
        elemanlariYazdir(sayilar);

    }

    private static void elemanlariYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(sayilar[i][j]+" ");

            }

        }
    }
}
