package kendi_kendime_2;

public class C12_Amstrong2 {
    public static void main(String[] args) {

        for (int i = 5; i >1 ; i--) {

            for (int j = (int) Math.pow(10,i)-1; j >(int)Math.pow(10,(i-1))-1 ; j--) {
                int sonuc=0;
                for (int k = j; k >0 ; k/=10) {
                    sonuc+=(int)Math.pow(k%10,i);
                }
                if(sonuc==j){
                    System.out.println(j+" amstrong sayidir");
                    }}}
                System.out.println("1 amstrong sayidir");}}


