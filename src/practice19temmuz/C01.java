package practice19temmuz;

public class C01 {
    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {
        int[][] sayi={{7,2,3}, {2,3,8} , {5,5,5} , {2,9,3}};
        int sayiMin=sayi[0][0];
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length; j++) {
                if(sayi[i][j]<sayiMin){
                    sayiMin=sayi[i][j];
                }

            }

        }
        System.out.println("sayiMin = " + sayiMin);
    }
}
