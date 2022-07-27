package kendi_kendime;

public class C16_WhileLoop {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if(i%20==0&&i%15==0&&i%90==0){
                System.out.println(i+" ");
            }
        }
    }
}
