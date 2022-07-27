package kendi_kendime_3;

public class C14_Array1 {
    public static void main(String[] args) {
        //verilen bir array deki tekrar eden elemanları yazzdırı
        int[] array={2,4,3,2,44,53,2,53,24,28,27,28};
        String tekrarEden="";
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j <array.length ; j++) {
                    if(array[i]==array[j]&&(!tekrarEden.contains((array[j]+"")))){
                        tekrarEden+=array[j]+" ";
                    }
                }

        }System.out.println(tekrarEden);

    }
}
