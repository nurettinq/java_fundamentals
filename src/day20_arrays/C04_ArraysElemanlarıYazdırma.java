package day20_arrays;

public class C04_ArraysElemanlarıYazdırma {
    public static void main(String[] args) {
        int ssayılar[]={1,2,3,4,5,6,7};

        for (int i = 0; i <ssayılar.length; i++) {
            if(i<ssayılar.length-1) {
                System.out.print(ssayılar[i]+",");
            }
            else{

            System.out.print(ssayılar[i]);

            }

        }
    }
}
